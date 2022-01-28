package com.codegym.demo.controllers;


import com.codegym.demo.entities.Category;
import com.codegym.demo.entities.Product;
import com.codegym.demo.services.ICategoryService;
import com.codegym.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public ModelAndView showList(@RequestParam(value = "page", defaultValue = "0") int page){
        ModelAndView modelAndView = new ModelAndView("/product/list");
        modelAndView.addObject("products", productService.findAll(PageRequest.of(page, 3)));
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createProduct(@Validated @ModelAttribute Product product, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("categories", categoryService.findAll());
//        new Product().validate(product, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return modelAndView;
        }else {
            productService.save(product);
            modelAndView.addObject("message", "Create Successfully");
            return modelAndView;
        }
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("/product/delete");
        modelAndView.addObject("product", productService.findById(id).get());
        return modelAndView;
    }

    @PostMapping("/delete")
    public String deleteProduct(@ModelAttribute Product product){
        productService.remove(product.getProductId());
        return "redirect:/product/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("/product/edit");
        modelAndView.addObject("product", productService.findById(id).get());
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute Product product){
        productService.save(product);
        return "redirect:/product/list";
    }

    @GetMapping("/search")
    public ModelAndView searchCustomer(@RequestParam("productName") String productName, @RequestParam("startPrice") String startPrice, @RequestParam("category")Category category, @RequestParam(value = "page", defaultValue = "0") int page){
        ModelAndView modelAndView = new ModelAndView("/product/list");
        if (startPrice.equals("")){
            modelAndView.addObject("products", productService.findAllByProductNameContainingAndCategory(productName, category, PageRequest.of(page, 3)));
        }else {
            modelAndView.addObject("products", productService.findAllByProductNameContainingAndProductPriceAndCategory(productName,  Double.parseDouble(startPrice), category, PageRequest.of(page, 3)));
        }
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }
}
