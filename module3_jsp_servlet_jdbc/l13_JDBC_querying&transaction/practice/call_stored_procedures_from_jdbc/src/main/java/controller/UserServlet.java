package controller;

import model.bean.User;
import model.service.UserService;
import model.service.ịmpl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "findUserById":
                findUserById(request, response);
                break;
            case "create":
                createUser(request, response);
                break;
            default:
                break;
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        int id = (int)Math.random()*1000;
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        boolean check = userService.insertUser(user);
        if (check){
            request.setAttribute("message", "Create successfully");
        }else {
            request.setAttribute("message", "Create unsuccessfully");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/user/list.jsp");
        request.setAttribute("userList", userService.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findUserById(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        RequestDispatcher requestDispatcher = null;
        if (user == null){
            request.setAttribute("error","error Id");
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("user",user);
            requestDispatcher = request.getRequestDispatcher("views/user/user.jsp");
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                insertUserForm(request, response);
                break;
            default:
                listUserForm(request, response);
                break;
        }
    }

    private void insertUserForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/user/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listUserForm(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("userList", userService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/user/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
