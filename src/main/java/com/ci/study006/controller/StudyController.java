package com.ci.study006.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study")
public class StudyController {

    @RequestMapping("/test")
    public String test(){
        return "helloworld";
    }
}
