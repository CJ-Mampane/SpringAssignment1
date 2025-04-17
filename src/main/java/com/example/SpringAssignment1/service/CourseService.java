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
        courses.add(new Course("Foundation Courses", new String[]{"Computer Literacy for Science", "Elementary computer programming"}));
        courses.add(new Course("Undergraduate Courses", new String[]{"Introduction to computing and programming concepts", "Elementary computer programming",
                                     "Advanced programming", "Computer architecture and organization", "Data structures and algorithms"}));
        courses.add(new Course("Honors Courses", new String[]{"Computer networks", "Distributed and parallel computing", "Advanced Java", "E-business fundamentals"}));
    }

    // Get all grouped course categories
    public List<Course> getCourses() {
        return courses;
    }

    // Get a course category by its name
    public Course getCourseByName(String name) {
        return courses.stream()
                .filter(course -> course.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Add a new course category
    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    // Update an existing course category by name
    public Course updateCourse(String name, Course updatedCourse) {
        Course existingCourse = getCourseByName(name);
        if (existingCourse != null) {
            existingCourse.setName(updatedCourse.getName());
            existingCourse.setCategory(updatedCourse.getCategory());
            return existingCourse;
        }
        return null;
    }

    // Delete a course category by name
    public boolean deleteCourse(String name) {
        return courses.removeIf(course -> course.getName().equalsIgnoreCase(name));
    }
   
}
