package com.Lec17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{
    @RequestMapping("/test")
   // @GetMapping("/test")
    @ResponseBody //for showing directly string as response
    public  String test()
    {
        int a=50;
        int b=60;
        return "This is just for testing /t sum of a send b is : "+(a+b);
    }
}
