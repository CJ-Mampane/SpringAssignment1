package com.example.SpringAssignment1;

public class Course {
    private Long id;
    private String name;
    private String category;

    public Course() {}

    public Course(Long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    // Getters and setters
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
