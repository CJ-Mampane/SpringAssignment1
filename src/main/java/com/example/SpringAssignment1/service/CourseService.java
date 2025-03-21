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
        courses.add(new Course("CSC111F Computer literacy for science", "Foundation"));
        courses.add(new Course("CSC121F Elementary computer programming", "Foundation"));

        courses.add(new Course("CSC113 Introduction to computing and programming concepts", "Undergraduate"));
        courses.add(new Course("CSC121 Elementary computer programming", "Undergraduate"));
        courses.add(new Course("CSC211 Advanced programming", "Undergraduate"));
        courses.add(new Course("CSC212 Computer architecture and organization", "Undergraduate"));
        courses.add(new Course("CSC223 Data structures and algorithms", "Undergraduate"));

        courses.add(new Course("CSC512 Computer networks", "Honours"));
        courses.add(new Course("CSC513 Distributed and parallel computing", "Honours"));
        courses.add(new Course("CSC515 Advanced Java", "Honours"));
        courses.add(new Course("CSC516 E-business fundamentals", "Honours"));
    }

    // Method to get all courses
    public List<Course> getCourses() {
        return courses;
    }
}
