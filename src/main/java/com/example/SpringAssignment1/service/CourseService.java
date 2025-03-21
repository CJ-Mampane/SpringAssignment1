package com.example.SpringAssignment1.service;

import com.example.SpringAssignment1.Course;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service  // Marks this class as a service component
public class CourseService {
    private final List<Course> courses = new ArrayList<>();

    // Constructor to add courses when the application starts
    public CourseService() {
        courses.add(new Course("Introduction to Programming", "Foundation"));
        courses.add(new Course("Computer Organization", "Foundation"));

        courses.add(new Course("Data Structures", "Undergraduate"));
        courses.add(new Course("Operating Systems", "Undergraduate"));
        courses.add(new Course("Database Systems", "Undergraduate"));
        courses.add(new Course("Computer Networks", "Undergraduate"));
        courses.add(new Course("Artificial Intelligence", "Undergraduate"));

        courses.add(new Course("Advanced Machine Learning", "Honours"));
        courses.add(new Course("Cybersecurity", "Honours"));
        courses.add(new Course("Cloud Computing", "Honours"));
        courses.add(new Course("Software Engineering Principles", "Honours"));
    }

    // Method to get all courses
    public List<Course> getCourses() {
        return courses;
    }
}
