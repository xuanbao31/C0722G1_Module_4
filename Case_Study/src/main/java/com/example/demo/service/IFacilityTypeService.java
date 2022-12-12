package com.example.demo.service;

import com.example.demo.model.facility.FacilityType;

import java.util.List;

public interface IFacilityTypeService {
    List<FacilityType> findAll();

    FacilityType findById(int id);
}
