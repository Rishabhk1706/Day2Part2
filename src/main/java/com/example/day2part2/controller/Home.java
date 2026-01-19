package com.example.day2part2.controller;
import java.util.*;
import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(1,"Rishabh","rk@gmail.com");
        return student;
    }
    @GetMapping("/about")
    public String about(){
        return "This is the about page";
    }
}
