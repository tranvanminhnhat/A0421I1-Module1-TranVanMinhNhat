package com.codegym.add_product_to_card.model;

import org.springframework.stereotype.Component;

@Component

public class Cart {
    private Long idCart;

    private Product product;

    private int quantity;

    public Cart() {
    }

    public Long getIdCart() {
        return idCart;
    }

    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
