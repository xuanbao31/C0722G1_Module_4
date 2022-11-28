package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/")
    public String showAllAndFindList(@PageableDefault(value = 2) Pageable pageable,
                                     @RequestParam(defaultValue = "") String name, Model model) {
        Page<Blog> blogs = blogService.showAndFindList(pageable, name);
        model.addAttribute("name", name);
        model.addAttribute("blogs", blogs);
        return "/list";
    }

    @GetMapping("{id}/view")
    public String showView(@PathVariable int id, Model model) {
        model.addAttribute("blogs", blogService.findById(id));
        return "/view";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blogs", new Blog());
        model.addAttribute("categoryList", categoryService.findAll());
        return "/create";
    }

    @PostMapping("/create")
    public String save(Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping("{id}/edit")
    public String showFormEdit(Model model, @PathVariable int id) {
        model.addAttribute("blogs", blogService.findById(id));
        model.addAttribute("categoryList", categoryService.findAll());
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(Blog blog, Model model) {
        blogService.save(blog);
//        model.addAttribute("categoryList", categoryService.findAll());
        return "redirect:/blog/";
    }

    @GetMapping("{id}/delete")
    public String showDeleteForm(@PathVariable int id,Model model) {
        model.addAttribute("blogs", blogService.findById(id));
        model.addAttribute("categoryList", categoryService.findAll());
        return "/delete";
    }

    @PostMapping("/delete")
    public String deleteBlog(@ModelAttribute("blog") Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:/blog/";
    }
}
