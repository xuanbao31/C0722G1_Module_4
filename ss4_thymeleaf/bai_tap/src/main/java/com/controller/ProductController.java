package com.controller;

import com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.service.IProductService;

@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/home";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Product product) {
        product.setId((int) (Math.random() * 1000));
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/{id}/update")
    public String showFormEdit(Model model, @PathVariable int id) {
        Product product = productService.findById(id);
        model.addAttribute("products", product);
        return "/edit";
    }

    @PostMapping("/update")
    public String edit(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(value = "deleteId") int productId) {
        productService.remove(productId);
        return "redirect:/";
    }

    @GetMapping("/{id}/view")
    public String showView(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("products", product);
        return "/view";
    }

    @GetMapping("/search")
    public String showSearch(@RequestParam String name,Model model) {
        model.addAttribute("products", productService.findByName(name));
        return "/home";
    }

}
