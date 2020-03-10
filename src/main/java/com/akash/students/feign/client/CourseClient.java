package com.akash.students.feign.client;

import com.akash.students.model.StudentCourses;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "courses-service")
@RibbonClient(name = "courses-service")
public interface CourseClient {
    @GetMapping("student/{studentId}/courses")
    StudentCourses getStudentCourses(@PathVariable int studentId);
}
