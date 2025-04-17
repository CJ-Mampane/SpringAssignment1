package com.example.SpringAssignment1.controller;

import com.example.SpringAssignment1.Course;
import com.example.SpringAssignment1.service.CourseService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // GET all course categories
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getCourses();
    }

    // GET a course category by name
    @GetMapping("/{name}")
    public ResponseEntity<Course> getCourseByName(@PathVariable String name) {
        Course course = courseService.getCourseByName(name);
        if (course != null) {
            return ResponseEntity.ok(course);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST a new course category
    @PostMapping
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        Course newCourse = courseService.addCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCourse);
    }

    // PUT to update a course category by name
    @PutMapping("/{name}")
    public ResponseEntity<Course> updateCourse(@PathVariable String name, @RequestBody Course course) {
        Course updated = courseService.updateCourse(name, course);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE a course category by name
    @DeleteMapping("/{name}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String name) {
        boolean removed = courseService.deleteCourse(name);
        if (removed) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
