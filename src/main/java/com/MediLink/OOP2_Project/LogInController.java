package com.MediLink.OOP2_Project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {

    @GetMapping("/")
    public String login() {
        return "login"; // This tells Spring to look for templates/login.html
    }
}
