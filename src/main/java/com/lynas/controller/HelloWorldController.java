package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class HelloWorldController {
    @RequestMapping("/showForm")
   public String showForm(){
        return "helloworld-form";
   }
}
