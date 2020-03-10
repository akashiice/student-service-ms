package com.akash.students.controller;

import com.akash.students.feign.client.CourseClient;
import com.akash.students.model.StudentCourses;
import com.akash.students.util.AppProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@Slf4j
@RestController
public class StudentsController {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private CourseClient courseClient;

    @GetMapping("/hello")
    public String helloWorld() {
        return appProperties.getName();
    }

    @GetMapping("/student/{studentId}")
    public StudentCourses getStudentInfo() {
        log.info("Students microservice");
        return courseClient.getStudentCourses(1);
    }

}
