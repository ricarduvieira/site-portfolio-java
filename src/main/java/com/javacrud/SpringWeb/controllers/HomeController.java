package com.javacrud.SpringWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/projeto1")
    public String projeto1() {
        return "projeto1";
    }
    @GetMapping("/projeto2")
    public String projeto2() {
        return "projeto2";
    }
    @GetMapping("/projeto3")
    public String projeto3() {
        return "projeto3";
    }
    @GetMapping("/projeto4")
    public String projeto4() {
        return "projeto4";
    }
    @GetMapping("/projeto5")
    public String projeto5() {
        return "projeto5";
    }
}
