package com.example.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        return "Hello";
    }

    @RequestMapping(value = "/about")
    public String about(){
        return "about.html";
    }
}
