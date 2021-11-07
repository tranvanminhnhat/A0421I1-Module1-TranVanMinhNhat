package controller;

import model.bean.Customer;
import model.service.CustomerService;
import model.service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends javax.servlet.http.HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createCustomer(request, response);
                break;
            case "update":
                updateCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            default:
                break;
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = (int)Math.random()*1000;
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");


        Customer customer = new Customer(id, name, email, address);
        boolean check = customerService.save(customer);
        if (check){
            request.setAttribute("message", "Create Successfully");
        }else {
            request.setAttribute("message", "Create Unsuccessfully");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/customer/list.jsp");
        request.setAttribute("customerList", customerService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(id, name, email, address);
        boolean check = customerService.update(id, customer);
        if (check){
            request.setAttribute("message", "update successfully");
        }else {
            request.setAttribute("message", "update unsuccessfully");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/customer/list.jsp");
        request.setAttribute("customerList", customerService.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        RequestDispatcher requestDispatcher;
        boolean check = customerService.remove(id);
        if (customer == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            if (check){
                request.setAttribute("message", "Delete Successfully");
            }else {
                request.setAttribute("message", "Delete Unsuccessfully");
            }
            requestDispatcher = request.getRequestDispatcher("views/customer/list.jsp");
            request.setAttribute("customerList", customerService.findAll());
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreatingForm(request, response);
                break;
            case "update":
                showUpdatingForm(request, response);
                break;
            case "delete":
                showDeletingForm(request, response);
                break;
            default:
                showListForm(request, response);
                break;
        }
    }

    private void showCreatingForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/customer/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdatingForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        RequestDispatcher requestDispatcher;
        if (customer == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customer", customer);
            requestDispatcher = request.getRequestDispatcher("views/customer/update.jsp");
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeletingForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        RequestDispatcher requestDispatcher;
        if (customer == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customer", customer);
            requestDispatcher = request.getRequestDispatcher("views/customer/delete.jsp");
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListForm(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("customerList", customerService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
