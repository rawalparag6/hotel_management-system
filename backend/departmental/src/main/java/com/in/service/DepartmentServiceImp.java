package com.in.service;

import com.in.entity.Department;
import com.in.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department updateDepartment(Department department) {
        return this.departmentRepository.save(department);
    }

    @Override
    public Object getDepartment(String dId) {
        return this.departmentRepository.findAll();
    }

    @Override
    public Department addDepartment(Department department) {
        return this.departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartment() {
        return this.departmentRepository.findAll();
    }

    @Override
    public String deleteDepartment(String dId) {
        this.departmentRepository.deleteById(Integer.valueOf(dId));
        return dId + "is deleted";
    }

    public DepartmentServiceImp(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
}

