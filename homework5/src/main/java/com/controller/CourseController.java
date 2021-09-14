package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    service.CourseService courseService;

    @Autowired
    public CourseController(service.CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<model.Course>> findAll(){
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/courses")
    public model.Course saveCourses(@RequestBody model.Course course){
        return courseService.save(course);
    }

    @DeleteMapping(value = "/courses/{id}")
    public void deleteCourseById(@PathVariable int id){
        courseService.deleteById(id);
    }
    @GetMapping("/courses/{id}")
    public model.Course findCourseById(@PathVariable int id){
        return  courseService.findById(id);
    }

    @PutMapping("/courses")
    public model.Course updateCourse(@RequestBody model.Course course){
        return   courseService.updateOnDatabase(course);
    }

    @GetMapping("/courses/findByName/{name}")
    public List<model.Course> getCoursesWithName(@PathVariable String name){
        return courseService.getCoursesWithName(name);
    }

    @GetMapping("/courses/findById/{id}")
    public List<Course> getCourseWithId(@PathVariable int id){
        return courseService.getCoursesWithId(id);
    }
}
