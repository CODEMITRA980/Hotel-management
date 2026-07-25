package com.product_service.dto;

public class CategoryDto {
    private Long id;
    private String name;

    // Ye getters hone chahiye — agar missing hain toh yehi problem hai
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
}