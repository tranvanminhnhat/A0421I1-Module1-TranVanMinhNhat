package com.codegym.validate_register_form.entity;


import org.hibernate.validator.constraints.Range;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User implements Validator {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "nvarchar(45)")
    @NotBlank(message = "items.empty")
    @Size(min = 5, max = 45)
    private String firstName;

    @Column(columnDefinition = "nvarchar(45)")
    @NotBlank(message = "items.empty")
    @Size(min = 5, max = 45)
    private String lastName;


    private String phoneNumber;

    @Range(min = 18, max = 60)
    private int age;

    private String email;

    public User() {
    }

    public User(@NotBlank @Size(min = 5, max = 45) String firstName, @NotBlank @Size(min = 5, max = 45) String lastName, String phoneNumber, @Range(min = 18) int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean supports(Class<?> clazz){
        return User.class.isAssignableFrom(clazz);
    }


    public void validate(Object target, Errors errors){
        User user = (User) target;
        String phoneNumber = user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
        if (phoneNumber.length()>11 || phoneNumber.length()<10){
            errors.rejectValue("phoneNumber", "items.wrongLength");
        }
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber", "items.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", "items.matches");
        }

        String email = user.getEmail();
        ValidationUtils.rejectIfEmpty(errors, "email", "items.empty");
        if (!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            errors.rejectValue("email", "email.matches");
        }
    }
}
