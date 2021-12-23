package com.codegym.springbootA04.controller;

import com.codegym.springbootA04.entity.Student;
import com.codegym.springbootA04.entity.Subject;
import com.codegym.springbootA04.repository.StudentRepository;
import com.codegym.springbootA04.repository.SubjectRepository;
import com.codegym.springbootA04.validate.StudentValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("students", studentRepository.getList());
        return "list";
    }

    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("subjects", subjectRepository.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("student") Student student,
                         BindingResult bindingResult, Model model){
        StudentValidator studentValidator = new StudentValidator();
        studentValidator.validate(student, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("subjects", subjectRepository.findAll());
            return "create";
        }
        studentRepository.createStudent(student);
        return "redirect:/student/list";
    }
}
