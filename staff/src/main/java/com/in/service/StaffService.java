package com.in.service;

import com.in.entity.Staff;

import java.util.List;

public interface StaffService {
    Staff addStaff(Staff staff);
    List<Staff> getStaff();


    Staff  updateStaff(Staff staff);

    String deleteStaff(String staffId);

}
