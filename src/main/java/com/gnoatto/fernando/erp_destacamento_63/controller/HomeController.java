package com.gnoatto.fernando.erp_destacamento_63.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String inicializa() {
        return "home";
    }
}
