package com.springboot.tutorial.thymeleafdemo.model;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private List<Integer> courses;

    @Value("#{${courses}}")
    private Map<Integer, String> mapCourses;

    public Student() {

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Integer> getCourses() {
        return courses;
    }

    public void setCourses(List<Integer> courses) {
        this.courses = courses;
    }

    /*public List<String> selectedMapCourses() {
        List<String> collect = this.courses.stream().filter(courseId -> mapCourses.containsKey(courseId)).collect(Collectors.toList());
        return collect;
    }*/

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + " country=" + country + "]";
    }
}
