package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phoneNumber;
    private String dateStart;
    private String dateEnd;
    private String paymentType;
    @ManyToOne
    @JoinColumn(name = "host_id", referencedColumnName = "id")
    private Host host;

    public Apartment() {
    }

    public Apartment(int id, String phoneNumber, String dateStart, String dateEnd, String paymentType, Host host) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.paymentType = paymentType;
        this.host = host;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }
}
