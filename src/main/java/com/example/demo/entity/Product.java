package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
 private Long id;
 private String name;
 private String description;
 private float price;

 protected Product() {
 }

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 public Long getId() {
     return id;
 }
}
