package com.spring.ResApi.services;

import com.spring.ResApi.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public  Course getCourse(long courseId);

    public Course addCourse(Course course);
}
