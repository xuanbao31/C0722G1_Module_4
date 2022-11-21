package com.controller;

import com.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/caculator")

public class CalculatorController {
    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("")
    public String showHome() {
        return "/index";
    }

    @GetMapping("/result")
    public ModelAndView result(@RequestParam String number1, String number2, String operator) {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("number1",number1);
        modelAndView.addObject("number2",number2);
        modelAndView.addObject("operator",operator);
//        return new ModelAndView("index", "result", calculatorService.calculator(number1, number2, operator));
       String  result = calculatorService.calculator(number1, number2, operator);
       modelAndView.addObject("result",result);
        return modelAndView;
    }
}
