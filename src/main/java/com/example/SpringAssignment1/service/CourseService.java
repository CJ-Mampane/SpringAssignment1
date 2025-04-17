package com.example.SpringAssignment1.service;

import com.example.SpringAssignment1.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
    private final List<Course> courses = new ArrayList<>();

    public CourseService() {
        courses.add(new Course("Foundation Courses", Arrays.asList("Computer Literacy for Science", "Elementary computer programming")));
        courses.add(new Course("Undergraduate Courses", Arrays.asList(
                "Introduction to computing and programming concepts", "Elementary computer programming",
                "Advanced programming", "Computer architecture and organization", "Data structures and algorithms")));
        courses.add(new Course("Honors Courses", Arrays.asList(
                "Computer networks", "Distributed and parallel computing", "Advanced Java", "E-business fundamentals")));
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Course getCourseByName(String name) {
        return courses.stream()
                .filter(course -> course.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    public Course updateCourse(String name, Course updatedCourse) {
        Course existingCourse = getCourseByName(name);
        if (existingCourse != null) {
            existingCourse.setName(updatedCourse.getName());
            existingCourse.setCategory(updatedCourse.getCategory());
            return existingCourse;
        }
        return null;
    }

    public boolean deleteCourse(String name) {
        return courses.removeIf(course -> course.getName().equalsIgnoreCase(name));
    }
}
