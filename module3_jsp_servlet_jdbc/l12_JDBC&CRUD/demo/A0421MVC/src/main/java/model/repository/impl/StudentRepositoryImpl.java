package model.repository.impl;

import model.bean.Student;
import model.repository.StudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL = "SELECT * FROM student;";
    final String INSERT_INTO_STUDENT = "INSERT INTO student(`name`,birthday,class_id,point,gender,email)" +
            "values(?,?,?,?,?,?);";

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        Connection connection=null;
        connection=baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(SELECT_ALL);
              ResultSet resultSet =preparedStatement.executeQuery();

            // dùng statement
//            Statement statement = connection.createStatement();
//            ResultSet resultSet =statement.executeQuery(SELECT_ALL);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String date = String.valueOf(resultSet.getDate("birthday"));
                int classId = resultSet.getInt("class_id");
                int point = resultSet.getInt("point");
                boolean gender = resultSet.getBoolean("gender");
                String account = resultSet.getString("account");
                String email = resultSet.getString("email");
                Student student = new Student(id,name,date,classId,point,gender,account,email);
                studentList.add(student);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentList;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public boolean save(Student student) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check =false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_STUDENT);

            preparedStatement.setString(1, student.getName());
            preparedStatement.setDate(2, Date.valueOf(student.getBirthday()));
            preparedStatement.setInt(3, student.getClassId());
            preparedStatement.setInt(4, student.getPoint());
            preparedStatement.setBoolean(5, student.isGender());
            preparedStatement.setString(6, student.getEmail());
            check = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int ind, Student student) {

    }
}
