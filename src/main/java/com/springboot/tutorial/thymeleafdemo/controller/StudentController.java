package com.springboot.tutorial.thymeleafdemo.controller;

import com.springboot.tutorial.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    // import the countries from application.properties to the countries list
    @Value("${countries}")
    private List<String> countries;

    // import the gender map from application.properties to the gender list
    @Value("#{${genders}}")
    private Map<String, String> genders;

    // import the gender map from application.properties to the gender list
    @Value("#{${courses}}")
    private Map<Integer,String> courses;

    @GetMapping("/form")
    public String showForm(Model model) {
        // add student object to model and then to form page
        model.addAttribute("student", new Student());
        // pass the countries list to the model
        model.addAttribute("countries", countries);
        model.addAttribute("genders", genders);
        model.addAttribute("courses", courses);
        return "form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        System.out.println(student.toString());
        return "confirmation";
    }

}
