package com.example.demo.controller;

import com.example.demo.model.facility.FacilityType;
import com.example.demo.model.facility.RentType;
import com.example.demo.service.IFacilityService;
import com.example.demo.service.IFacilityTypeService;
import com.example.demo.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IFacilityTypeService facilityTypeService;
    @Autowired
    private IRentTypeService rentTypeService;

    @GetMapping("/list")
    public String showFacility(@PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("facility", facilityService.findAll(pageable));
        List<FacilityType> facilityTypeList = facilityTypeService.findAll();
        model.addAttribute("facilityType", facilityTypeList);
        List<RentType> rentTypeList = rentTypeService.findAll();
        model.addAttribute("rentType", rentTypeList);
        return "/facility/list";
    }

}
