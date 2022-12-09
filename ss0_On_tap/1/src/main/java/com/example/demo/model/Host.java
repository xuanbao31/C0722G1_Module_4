package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameHost;
    private String nameFiancee;
    @JsonBackReference
    @OneToMany(mappedBy = "host")
    private Set<Apartment> apartments;
    @JsonBackReference
    @OneToMany(mappedBy = "host")
    private Set<Children> children;

    public Host() {
    }

    public Host(int id, String nameHost, String nameFiancee, Set<Apartment> apartments, Set<Children> children) {
        this.id = id;
        this.nameHost = nameHost;
        this.nameFiancee = nameFiancee;
        this.apartments = apartments;
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameHost() {
        return nameHost;
    }

    public void setNameHost(String nameHost) {
        this.nameHost = nameHost;
    }

    public String getNameFiancee() {
        return nameFiancee;
    }

    public void setNameFiancee(String nameFiancee) {
        this.nameFiancee = nameFiancee;
    }

    public Set<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(Set<Apartment> apartments) {
        this.apartments = apartments;
    }

    public Set<Children> getChildren() {
        return children;
    }

    public void setChildren(Set<Children> children) {
        this.children = children;
    }
}
