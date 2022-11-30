package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserDto;
import com.example.demo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("users", userService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("users", userService.findAll());
        model.addAttribute("userDto", new UserDto());
        return "/create";
    }

    @PostMapping("/save")
    public String createUser(@ModelAttribute @Validated UserDto userDto, BindingResult bindingResult, Model model,
                             RedirectAttributes redirectAttributes) {
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", userService.findAll());
            return "/create";
        }else{
         User user =new User();
            BeanUtils.copyProperties(userDto,user);
            userService.save(user);
            return "redirect:/";
        }
    }
}
