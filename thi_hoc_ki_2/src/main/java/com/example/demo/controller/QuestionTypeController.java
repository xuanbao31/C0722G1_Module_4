package com.example.demo.controller;

import com.example.demo.model.QuestionContent;
import com.example.demo.model.QuestionDTO;
import com.example.demo.model.QuestionType;
import com.example.demo.service.IQuestionContentService;
import com.example.demo.service.IQuestionTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/questionType")
public class QuestionTypeController {
    @Autowired
    private IQuestionContentService questionContentService;
    @Autowired
    private IQuestionTypeService questionTypeService;

    @GetMapping("/list")
    public String showList(@PageableDefault(value = 1) Pageable pageable, Model model) {
        model.addAttribute("questionType", questionTypeService.findAll());
        model.addAttribute("questionContent", questionContentService.findAll(pageable));
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<QuestionType> questionTypes = questionTypeService.findAll();
        model.addAttribute("questionType", questionTypes);
        model.addAttribute("questionDto", new QuestionDTO());
        return "/create";
    }

    @PostMapping("/create")
    public String saveCreate(@Validated @ModelAttribute QuestionDTO questionDTO,
                             BindingResult bindingResult, Model model) {
        new QuestionDTO().validate(questionDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("questionType", questionTypeService.findAll());
            return "/create";
        } else {
            QuestionContent questionContent = new QuestionContent();
            BeanUtils.copyProperties(questionDTO, questionContent);
            questionContentService.save(questionContent);
            return "redirect:/questionType/list";
        }
    }
    @GetMapping("{id}/delete")
    public String showDeleteForm(@PathVariable int id, Model model) {
        model.addAttribute("questionContent", questionContentService.findById(id));
        model.addAttribute("questionType", questionTypeService.findAll());
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute QuestionContent questionContent, RedirectAttributes redirectAttributes) {
        questionContent.setStatus(1);
        questionContentService.save(questionContent);
//            customerService.remove(customer.getId());
        return "redirect:/questionType/list";
    }

}
