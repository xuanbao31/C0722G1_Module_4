package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogs", blogList);
        return "/list";
    }

    @GetMapping("{id}/view")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("blogs", blogService.findById(id));
        return "/view";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String addToList(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Them Moi Thanh Cong");
        return "redirect:/";

    }

}
