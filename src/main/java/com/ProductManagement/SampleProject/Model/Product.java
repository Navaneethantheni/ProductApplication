package com.ProductManagement.SampleProject.Model;

import jakarta.persistence.Column;

import java.util.Date;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Date createdDate;

    public Product() {
    }

    public Product(Long id, String name, String description, Double price, Date createdDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
