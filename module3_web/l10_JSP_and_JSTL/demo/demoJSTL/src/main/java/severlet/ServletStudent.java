package severlet;

import model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletStudent", urlPatterns = {"/list"})
public class ServletStudent extends HttpServlet {
    List<Student> studentList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        studentList.add(new Student(1, "Trần Văn Chánh", true, 5));
        studentList.add(new Student(2, "ha", false, 6));
        studentList.add(new Student(3, "minh", true, 7));
        studentList.add(new Student(4, "hai", true, 8));
        studentList.add(new Student(5, "nhung", false, 9));
        studentList.add(new Student(6, "tien", true, 10));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", studentList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/home.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("hủy");
    }
}
