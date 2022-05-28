package controller;

import model.service.Impl.PatientServiceImpl;
import model.service.PatientService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PatientServlet", urlPatterns = {"/patient"})
public class PatientServlet extends HttpServlet {
    PatientService patientService = new PatientServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action){
            case "create":
                break;
            default:
                showListForm(request, response);
                break;
        }
    }

    private void showListForm(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("patientList", patientService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/home.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
