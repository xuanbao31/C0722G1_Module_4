package com.model;

public class Product {
    private int id;
    private String name;
    private String date;
    private String price;
    private String status;

    public Product() {
    }

    public Product(int id, String name, String date, String price, String status) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
