package com.Lecture4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{
    @GetMapping("/test")
    @ResponseBody // it is using for directly return as a string
    public  String test()
    {
        return "Sri Ganesh...!!";
    }
}
