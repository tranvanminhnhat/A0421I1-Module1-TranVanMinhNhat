package controller;

import model.bean.Product;
import model.service.ServiceProduct;
import model.service.impl.ServiceProductImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends javax.servlet.http.HttpServlet {
    ServiceProduct serviceProduct = new ServiceProductImpl();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createProduct(request, response);
                break;
            case "update":
                updateProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
            default:
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("search");
        Product product = serviceProduct.search(name);
        if (product == null){
            request.setAttribute("message", "There is not a product name like this");
        }else {
            request.setAttribute("product", product);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/search.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = serviceProduct.findById(id);
        RequestDispatcher requestDispatcher;
        if (product == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            serviceProduct.remove(id);
            try {
                response.sendRedirect("/product");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        double price = Double.parseDouble(request.getParameter("price"));
        Product product = serviceProduct.findById(id);
        RequestDispatcher requestDispatcher;
        if (product == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            product.setName(name);
            product.setBrand(brand);
            product.setPrice(price);
            serviceProduct.update(id, product);
            request.setAttribute("message", "Update successfully");
            request.setAttribute("product", product);
            requestDispatcher = request.getRequestDispatcher("views/product/update.jsp");
        }

        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        double price = Double.parseDouble(request.getParameter("price"));
        int id = (int)(Math.random() * 10000);

        Product product = new Product(id, name, brand, price);
        serviceProduct.save(product);
        request.setAttribute("message", "create successfully");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/list.jsp");
        request.setAttribute("productList", serviceProduct.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
            case "detail":
                showDetailForm(request, response);
                break;
            default:
                showListForm(request, response);
                break;
        }
    }

    private void showDetailForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = serviceProduct.findById(id);
        request.setAttribute("product", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/detail.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListForm(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("productList", this.serviceProduct.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/list.jsp");
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
        Product product = serviceProduct.findById(id);
        RequestDispatcher requestDispatcher;
        if (product == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product", product);
            requestDispatcher = request.getRequestDispatcher("views/product/delete.jsp");
        }
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
        Product product = serviceProduct.findById(id);
        RequestDispatcher requestDispatcher;
        if (product == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product", product);
            requestDispatcher = request.getRequestDispatcher("views/product/update.jsp");
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreatingForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
