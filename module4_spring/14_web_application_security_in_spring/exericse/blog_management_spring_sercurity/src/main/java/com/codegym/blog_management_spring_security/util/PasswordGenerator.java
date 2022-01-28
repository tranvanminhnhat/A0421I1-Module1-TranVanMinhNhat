package com.codegym.blog_management_spring_security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static String generator(String raw){
        return new BCryptPasswordEncoder().encode(raw);
    }

    public static void main(String[] args) {
        String passwordEncode = new BCryptPasswordEncoder().encode("123456");
        System.out.println("Password: " + passwordEncode + "|");
    }
}
