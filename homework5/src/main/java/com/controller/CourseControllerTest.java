package controller;


import com.controller.CourseController;
import model.Course;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


class CourseControllerTest {

    @Mock
    service.CourseService mockCourseService;
    @InjectMocks
    CourseController courseController;


    @Test
    void findAll() {
        //given

        List<Course> courses  = new ArrayList<Course>();
        Mockito.when(mockCourseService.findAll()).thenReturn(courses);
        //when
        courses = this.courseController.findAll().getBody();

        //then
        assertNotNull(courses);
    }

}