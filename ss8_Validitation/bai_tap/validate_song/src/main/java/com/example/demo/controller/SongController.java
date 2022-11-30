package com.example.demo.controller;

import com.example.demo.model.Song;
import com.example.demo.model.SongDto;
import com.example.demo.servicee.ISongService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("songs", songService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("songDto", new SongDto());
        model.addAttribute("songs", songService.findAll());
        return "/create";
    }

    @PostMapping("/save")
    public String createSong(@Validated @ModelAttribute SongDto songDto,
                             BindingResult bindingResult,
                             Model model) {
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/create";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.save(song);
            return "redirect:/";
        }
    }

    @GetMapping("{id}/edit")
    public String showFormEdit(@PathVariable int id, Model model) {
        Song song = songService.findById(id);
        SongDto songDto = new SongDto();
        BeanUtils.copyProperties(song, songDto);
        model.addAttribute("songDto", songDto);
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute @Validated SongDto songDto, BindingResult bindingResult) {
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/edit";
        }else{
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.save(song);
            return "redirect:/";
        }
    }
}
