package com.example.SpringAssignment1.controller;

import com.example.SpringAssignment1.Course;
import com.example.SpringAssignment1.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(produces = "text/html")  // This forces the response to be HTML
    public String getCoursesAsHtml() {
        List<Course> courses = courseService.getCourses();
        StringBuilder html = new StringBuilder("<html><body>");
        html.append("<h2>Courses Offered</h2>");
        html.append("<table border='1'><tr><th>Course Name</th><th>Category</th></tr>");

        for (Course course : courses) {
            html.append("<tr><td>").append(course.getName()).append("</td>")
                    .append("<td>").append(course.getCategory()).append("</td></tr>");
        }

        html.append("</table></body></html>");
        return html.toString();
    }
}

/*package com.example.SpringAssignment1.controller;

import com.example.SpringAssignment1.Course;
import com.example.SpringAssignment1.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController  // Marks this class as a REST controller
@RequestMapping("/courses")  // Base URL: http://localhost:8080/courses
public class CourseController {
    private final CourseService courseService;

    // Constructor-based dependency injection
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // HTTP GET request handler to fetch courses
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getCourses();
    }
}*/

