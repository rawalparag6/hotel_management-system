package com.in.controller;

import com.in.entity.Department;
import com.in.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    final Logger logger= LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/add")
    public ResponseEntity<?> addDepartment(@RequestBody Department department) {
        logger.info("Inside add department details of departmentcontroller");
        return ResponseEntity.ok(departmentService.addDepartment(department));

    }

    @GetMapping("/find")
    public ResponseEntity<?> getDepartment() {
        logger.info("Inside find department details of departmentcontroller");
        return ResponseEntity.ok(departmentService.getDepartment());
    }

    @GetMapping("/find/{id}")

    public ResponseEntity<?> getDepartmentById(@PathVariable String dId) {
        logger.info("Inside find department details of departmentcontroller");
        return ResponseEntity.ok(departmentService.getDepartment(dId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateDepartment(@RequestBody Department department) {
        logger.info("Inside update department details of departmentcontroller");
        return ResponseEntity.ok(departmentService.updateDepartment(department));
    }
    @DeleteMapping("/delete/{dId}")
    public  ResponseEntity<?> deleteDepartment(@PathVariable String dId){
        logger.info("Inside delete department details of departmentcontroller");
        return ResponseEntity.ok(departmentService.deleteDepartment(dId));
    }


}