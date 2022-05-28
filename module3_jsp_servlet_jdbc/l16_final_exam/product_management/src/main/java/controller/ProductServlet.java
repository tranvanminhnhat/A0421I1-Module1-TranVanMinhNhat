package controller;

import model.bean.Category;
import model.bean.Product;
import model.service.CategoryService;
import model.service.Impl.CategoryServiceImpl;
import model.service.Impl.ProductServiceImpl;
import model.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductServiceImpl();
    CategoryService categoryService = new CategoryServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int product_id = Integer.parseInt(request.getParameter("product_id"));
        String product_name = request.getParameter("product_name");
        double product_price = Double.parseDouble(request.getParameter("product_price"));
        int product_quantity = Integer.parseInt(request.getParameter("product_quantity"));
        String product_color = request.getParameter("product_color");
        String product_description = request.getParameter("product_description");
        int category_id = Integer.parseInt(request.getParameter("category_id"));
        Product product = new Product(product_id, product_name, product_price, product_quantity, product_color, product_description, category_id);
        productService.update(product, product_id);
        request.setAttribute("productList", productService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/list.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        int product_id = (int)Math.random()*1000;
        String product_name = request.getParameter("product_name");
        double product_price = Double.parseDouble(request.getParameter("product_price"));
        int product_quantity = Integer.parseInt(request.getParameter("product_quantity"));
        String product_color = request.getParameter("product_color");
        String product_description = request.getParameter("product_description");
        int category_id = Integer.parseInt(request.getParameter("category_id"));
        Product product = new Product(product_id, product_name, product_price, product_quantity, product_color, product_description, category_id);
        productService.save(product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/list.jsp");
        request.setAttribute("productList", productService.findAll());
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
                showCreateForm(request, response);
                break;
            case "update":
                showUpdateForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            default:
                showListForm(request, response);
                break;
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        request.setAttribute("product", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/delete.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        List<Category> categoryList = categoryService.findAll();

        RequestDispatcher requestDispatcher;
        request.setAttribute("product", product);
        request.setAttribute("categoryList", categoryList);
        requestDispatcher = request.getRequestDispatcher("views/product/update.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = categoryService.findAll();
        request.setAttribute("categoryList", categoryList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListForm(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("productList", productService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/product/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
