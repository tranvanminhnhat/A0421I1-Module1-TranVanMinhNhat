package com.codegym.add_product_to_card.controller;

import com.codegym.add_product_to_card.model.Cart;
import com.codegym.add_product_to_card.model.Product;
import com.codegym.add_product_to_card.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private ProductService productService;

    @GetMapping("/buy/{id}")
    public String addToCard(@PathVariable Long id, @SessionAttribute("carts")HashMap<Long, Cart> hashMap, Model model){
        Product product = productService.findById(id);

        if (product != null){
            if (!hashMap.containsKey(id)){
                Cart item = new Cart();
                item.setProduct(product);
                item.setQuantity(1);
                hashMap.put(id, item);
            }else {
                Cart item = hashMap.get(id);
                item.setQuantity(item.getQuantity() + 1);
                hashMap.put(id, item);
            }
        }
        model.addAttribute("carts", hashMap);
        model.addAttribute("quantity", hashMap.size());
        model.addAttribute("cartMoney", totalPrice(hashMap));
        return "cart";
    }

    public double totalPrice(HashMap<Long, Cart> hashMap){
        double total = 0;
        for (Map.Entry<Long, Cart> list : hashMap.entrySet()){
            total += list.getValue().getQuantity() * Double.parseDouble(list.getValue().getProduct().getDiscount());
        }
        return total;
    }
}
