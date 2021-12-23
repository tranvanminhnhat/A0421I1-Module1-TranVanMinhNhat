package com.codegym.validate_register_form.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class User implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
