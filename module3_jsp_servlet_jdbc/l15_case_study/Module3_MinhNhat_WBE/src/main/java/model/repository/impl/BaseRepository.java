package model.repository.impl;

import model.bean.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {

    public Connection connectDatabase(){
        final String URL = "jdbc:mysql://localhost:3306/furama?useSSL=false";
        final String USER = "root";
        final String PASSWORD = "123456";
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                return connection;
            }catch (SQLException e){
                e.printStackTrace();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

//    private static Connection connectDatabase = null;
//    static {
//        String url = "jdbc:mysql://localhost:3306/furama?useSSL=false";
//        String user = "root";
//        String password = "123456";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connectDatabase = DriverManager.getConnection(url, user, password);
//        }catch (ClassNotFoundException | SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static Connection getConnectDatabase(){
//        return connectDatabase;
//    }
}
