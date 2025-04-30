package com.MediLink.OOP2_Project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // This tells Spring to look for templates/index.html
    }
}
