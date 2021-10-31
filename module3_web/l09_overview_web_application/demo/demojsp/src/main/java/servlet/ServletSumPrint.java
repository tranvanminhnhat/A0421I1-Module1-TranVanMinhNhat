package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSum", urlPatterns = {"/sum"})
public class ServletSumPrint extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("first"));
        float second = Float.parseFloat(request.getParameter("second"));
        float sum = first+second;
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<h1> post -sum:  "+sum+" </h1>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          float first = Float.parseFloat(request.getParameter("first"));
          float second = Float.parseFloat(request.getParameter("second"));
          float sum = first+second;
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<h1> get- sum: "+sum+" </h1>");
    }
}
