package com.example.day2part2.controller;
import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {
    @GetMapping("/")
    public List<StudentModel> getStudent(){
        List<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel(1, "Rishabh", "rk1@gmail.com"));
        students.add(new StudentModel(2, "Aman", "aman@gmail.com"));
        students.add(new StudentModel(3, "Neha", "neha@gmail.com"));
        students.add(new StudentModel(4, "Priya", "priya@gmail.com"));
        students.add(new StudentModel(5, "Rahul", "rahul@gmail.com"));
        return students;
    }
    @GetMapping("/about")
    public String about(){
        return "This is the about page";
    }
}
