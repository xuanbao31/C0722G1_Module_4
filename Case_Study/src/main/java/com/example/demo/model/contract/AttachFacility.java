package com.example.demo.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double cost;
    private String unit;
    private String status ;
    @JsonBackReference
    @OneToMany(mappedBy = "attachFacility")
    private Set<ContractDetail> contractDetails;

}
