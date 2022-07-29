package com.spring.ResApi.Controller;

import com.spring.ResApi.entities.Course;
import com.spring.ResApi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "welcome to course application";
    }



    // get the courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();

    }


    // get the single course
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return  this.courseService.getCourse(Long.parseLong(courseId));
    }

    // add the single course
    @PostMapping("/courses")
    public Course addCourse (@RequestBody Course course)
    {
        return  this.courseService.addCourse(course);
    }


}