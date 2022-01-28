package com.codegym.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.validation.Errors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "int")
    private Integer productId;

    @Column(columnDefinition = "varchar(45)")
    @NotBlank(message = "{productName.empty}")
    @Size(min = 5, max = 50, message = "{productName.format}")
    private String productName;

    @Column(columnDefinition = "double")
    @NotNull(message = "{productPrice.empty}")
    @Positive(message = "{productPrice.wrong}")
    private Double productPrice;

    @Column(columnDefinition = "varchar(45)")
    @NotBlank(message = "{productStatus.empty}")
    private String productStatus;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false, referencedColumnName = "categoryId")
    @JsonBackReference
    private Category category;

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

//    public boolean supports(Class<?> clazz){
//        return Product.class.isAssignableFrom(clazz);
//    }
//
//    public void validate(Object target, Errors errors){
//        Product product = (Product) target;
//
//        Double productPrice = product.getProductPrice();
//        if (productPrice < 100000){
//            errors.rejectValue("productPrice", "productPrice.value");
//        }
//    }
}
