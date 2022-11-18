package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.IDictionaryService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("")
    public String homeDictionary() {
        return "/index";
    }


    @PostMapping("/translate")
    public String result(@RequestParam String vocabulary, Model model) {
        String result = dictionaryService.change(vocabulary);
        model.addAttribute("result", result);
        return "/index";
    }

}
