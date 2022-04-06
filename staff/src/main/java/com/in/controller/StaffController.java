package com.in.controller;

import com.in.entity.Staff;
import com.in.service.StaffService;
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
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    final Logger logger= LoggerFactory.getLogger(StaffController.class);

    @PostMapping("/add")
    public ResponseEntity<?> addStaff(@RequestBody Staff staff)
    {
        logger.info("Inside add staff details of staffcontroller");
        return  ResponseEntity.ok(staffService.addStaff(staff));
    }
    @GetMapping("/find")
    public ResponseEntity<?> getStaff(){
        logger.info("Inside find staff details of staffcontroller");
        return  ResponseEntity.ok(staffService.getStaff());
    }


    @PutMapping("/update")
    public ResponseEntity<?> updateStaff(@RequestBody Staff staff)
    {
        logger.info("Inside update staff details of staffcontroller");
        return ResponseEntity.ok(staffService.updateStaff(staff));
    }
    @DeleteMapping("/delete/{staffId}")
    public  ResponseEntity<?> deleteStaff(@PathVariable String staffId){
        logger.info("Inside delete staff details of staffcontroller");
        return ResponseEntity.ok(staffService.deleteStaff(staffId));
    }


}


