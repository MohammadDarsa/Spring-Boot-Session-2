package com.example.demo.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class OrderDto {
    private String description;
    private Double price;
}
