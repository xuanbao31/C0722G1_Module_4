package com.controller;

import com.model.Email;
import com.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {
    @Autowired
    private IEmailService emailService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("languageList", emailService.language());
        model.addAttribute("pageSizeList", emailService.pageSize());
        model.addAttribute("spamsFilterList", emailService.spamsFilter());
        model.addAttribute("email", new Email());
        return "/index";
    }

    @PostMapping("/emailUpdate")
    public String update(@ModelAttribute("save") Email email, Model model) {
        model.addAttribute("message", "Thêm Mới Thành Công");
        return "/create";
    }
}
