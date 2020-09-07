package edu.mum.springcloud.studentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping("/savestudent/{name}")
    public String ThenewStudent(@PathVariable("name") String name) {

        return "the new Student is Saved" + name;


    }

    @GetMapping("/allstudent")
    public String getAllstudent() {

        return "lists are {Fikir ,Beki} ";

    }
}
