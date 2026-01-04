package com.example.payroll.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayrollController {

    @GetMapping("/payroll")
    public String payroll(Model model) {
        model.addAttribute("message", "Welcome to Payroll System");
        return "payroll";
    }
}
