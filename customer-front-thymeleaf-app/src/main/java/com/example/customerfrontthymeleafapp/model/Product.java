package com.example.customerfrontthymeleafapp.model;


import lombok.*;



@Getter @Setter @Builder
public class Product {
    private String id;
    private String name;
    private int quantity;
    private double price;
}
