package com.Lecture4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController
{
    @GetMapping("/home")
    public  String home()
    {
        System.out.println("This is home page");
        return  "home";
    }
}
