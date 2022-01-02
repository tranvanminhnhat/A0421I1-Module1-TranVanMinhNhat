package com.codegym.add_product_to_card.controller;

import com.codegym.add_product_to_card.model.Cart;
import com.codegym.add_product_to_card.model.Product;
import com.codegym.add_product_to_card.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("/product")
@SessionAttributes("carts")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ModelAttribute("carts")
    public HashMap<Long, Cart> cartHashMap(){
        return new HashMap<>();
    }

    @GetMapping("/list")
    public String showList(Model model, HttpSession session){
        Iterable<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "/list";
    }

    @GetMapping("/view-create")
    public String viewCreate(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create-product")
    public String createProduct(@ModelAttribute("product") Product product){
        productService.save(product);
        return "redirect:/product/list";
    }

    @GetMapping("/view-product/{id}")
    public String viewProduct(@PathVariable Long id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "detail";
    }
}
