package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
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
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IBlogService blogService;

    @GetMapping("/")
    public String showAllAndFindList(@PageableDefault(value = 2) Pageable pageable,
                                     @RequestParam(defaultValue = "") String name, Model model) {
        Page<Category> categories = categoryService.showListAndFindList(pageable, name);
        model.addAttribute("name", name);
        model.addAttribute("categories", categories);
        return "/category/list";
    }


    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("categories", new Category());
        return "/category/create";
    }

    @PostMapping("/create")
    public String save(Category category) {
        categoryService.save(category);
        return "redirect:/category/";
    }

    @GetMapping("{id}/edit")
    public String showFormEdit(Model model, @PathVariable int id) {
        model.addAttribute("categories", categoryService.findById(id));

        return "/category/edit";
    }

    @PostMapping("/edit")
    public String update(Category category, Model model) {
        categoryService.save(category);
//        model.addAttribute("categoryList", categoryService.findAll());
        return "redirect:/category/";
    }

    @GetMapping("{id}/delete")
    public String showDeleteForm(@PathVariable int id,Model model) {
        model.addAttribute("categories", categoryService.findById(id));
        return "/category/delete";
    }

    @PostMapping("/delete")
    public String deleteBlog(@ModelAttribute("category") Category category) {
        categoryService.remove(category.getId());
        return "redirect:/category/";
    }


}
