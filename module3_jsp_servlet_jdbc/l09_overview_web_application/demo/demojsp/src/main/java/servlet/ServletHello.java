package servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletHello", urlPatterns = {"/hello"})
public class ServletHello extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>Hello Servlet băng phương thức post</h1>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>Hello Servlet băng phương thức get</h1>");
    }
}
