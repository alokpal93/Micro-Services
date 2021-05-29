package com.dailycodebuffer.department.controler;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside getDepartmentById of Department Controller");
        return departmentService.getDepartmentById(departmentId);
    }
}
