package com.example.demo.service;

import com.example.demo.model.facility.Facility;
import com.example.demo.repository.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository facilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return facilityRepository.findAll(pageable);
    }

    @Override
    public void save(Facility facility) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Facility findById(int id) {
        return null;
    }

    @Override
    public Page<Facility> findByName(Pageable pageable, String name) {
        return facilityRepository.findByNameContaining(pageable, name);
    }
}
