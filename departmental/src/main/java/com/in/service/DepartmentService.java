package com.in.service;

import com.in.entity.Department;

import java.util.List;

public interface DepartmentService {


    Department updateDepartment(Department department);

    Object getDepartment(String dId);

    Department addDepartment(Department department);

    List<Department> getDepartment();

    String deleteDepartment(String dId);
}
