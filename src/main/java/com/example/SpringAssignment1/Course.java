package com.example.SpringAssignment1;

public class Course {
    private String name;
    private String[] category;

    public Course() {}

    public Course(String name, String[] category) {
        this.name = name;
        this.category = category;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }
}
