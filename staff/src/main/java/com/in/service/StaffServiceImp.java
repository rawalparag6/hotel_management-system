package com.in.service;

import com.in.entity.Staff;
import com.in.repo.StaffRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImp implements StaffService {
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff addStaff(Staff staff) {
        return this.staffRepository.save(staff);
    }

    @Override
    public List<Staff> getStaff() {
        return this.staffRepository.findAll();
    }


    @Override
    public Staff updateStaff(Staff staff) {
        return this.staffRepository.save(staff);
    }

    @Override
    public String deleteStaff(String staffId) {
        this.staffRepository.deleteById(staffId);
        return staffId + "is deleted";
    }

    public StaffServiceImp(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
}
