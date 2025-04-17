package com.example.SpringAssignment1;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public class Course {

    @NotNull(message = "Course name must not be null")
    @NotEmpty(message = "Course name must not be empty")
    private String name;

    @NotNull(message = "Course list must not be null")
    @NotEmpty(message = "At least one course must be provided")
    private List<String> category;

    public Course() {}

    public Course(String name, List<String> category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }
}
