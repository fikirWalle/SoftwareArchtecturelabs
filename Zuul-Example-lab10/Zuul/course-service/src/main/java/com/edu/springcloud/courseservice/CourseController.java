package com.edu.springcloud.courseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/allcourse")
    public String course() {


        return "listof course {WAP,WAA}";
    }

    @GetMapping("/findoffer")
    public String offerCourse() {
        return "offer is{WAA}";

    }


}
