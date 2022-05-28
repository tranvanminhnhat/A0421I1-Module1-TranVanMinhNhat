package servlet;

import model.Customer;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", urlPatterns = {"/list"})
public class ServletCustomer extends HttpServlet {
    List<Customer> customerList = new ArrayList<>();

    @Override
    public void init(ServletConfig config) throws ServletException {


        customerList.add(new Customer(1, "Minh Nhật", "27/10/1999", "Quảng Nam", "/static/img/nhat_avatar.jpg"));
        customerList.add(new Customer(2, "Minh Tuấn", "10/12/1998", "Quảng Ngãi", "/static/img/tuan_avatar.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/home.jsp");
        requestDispatcher.forward(request, response);
    }
}
