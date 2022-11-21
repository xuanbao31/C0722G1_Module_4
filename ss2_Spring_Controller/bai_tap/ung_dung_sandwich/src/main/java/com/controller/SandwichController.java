package com.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping
    public String showListSandWich() {
        return "/index";
    }

    @GetMapping("/sandwich")
    public String addCondiment(@RequestParam String[] a, Model model) {
        model.addAttribute("food", a);
        return "/index";
    }
}
