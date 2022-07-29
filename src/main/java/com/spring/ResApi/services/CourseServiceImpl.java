package com.spring.ResApi.services;

import com.spring.ResApi.entities.Course;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


       List<Course> list;

       public CourseServiceImpl(){
           list=new ArrayList<>();
           list.add(new Course(145, "java core course", "this course contanis basic of java"));
           list.add(new Course(2542, " core ", "spring boot"));
       }
    @Override

    public List<Course> getCourses() {
        // tooo Auto-generated method stub

        return list;
    }

    @Override
    public  Course getCourse(long courseId){
           Course c=null;
           for(Course course:list)
           {
               if(course.getId()==courseId){
                   c=course;
                   break;
               }
           }
           return  c;
    }

    @Override

    public  Course addCourse(Course course){
           list.add(course);
           return course;
    }
}
