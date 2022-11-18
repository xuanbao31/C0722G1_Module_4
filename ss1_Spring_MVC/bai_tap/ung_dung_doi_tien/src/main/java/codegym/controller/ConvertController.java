package codegym.controller;

import codegym.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/change")
public class ConvertController {
    @Autowired
    private IConvertService convertService;

    @GetMapping("")
    public String homeConvert() {
        return "/index";
    }

    @PostMapping("/convert")
    public ModelAndView result(@RequestParam String amount, @RequestParam String rate) {
        return new ModelAndView("/index", "result", convertService.convert(Double.parseDouble(amount), Double.parseDouble(rate)));
    }
}
