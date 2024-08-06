package com.springboot.tutorial.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.tutorial.thymeleafdemo.model.Student;

@Controller
public class StudentController {

    @GetMapping("/form")
    public String showForm(Model model) {
        // add student object to model and then to form page
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        System.out.println(student.toString());
        return "confirmation";
    }

}
