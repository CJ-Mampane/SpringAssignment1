package com.example.SpringAssignment1;

public class Course {

    private String name;
    private String category;

    public Course(String name, String category) {
            this.name = name;
            this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
            return name;
    }
    public String getCategory() {
            return category;
    }
}
