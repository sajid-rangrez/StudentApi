package com.example.demo.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/")
    public String home(){
        System.out.println("Home page");
        return "home.html";
    }
}
