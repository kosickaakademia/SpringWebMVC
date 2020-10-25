package com.lynas.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value="/")
    public String home(){

        System.out.println("Lalalalala");return "test";
    }

    @RequestMapping(value="/add")
    public String add(){
        return "WEB-INF/add";
    }
}
