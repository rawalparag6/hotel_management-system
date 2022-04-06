package com.in.service;

import com.in.entity.Department;
import com.in.repo.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceImpTest {
    @Mock
    private DepartmentRepository departmentRepository;

    private  DepartmentServiceImp departmentServiceImp;

    @BeforeEach
    void setUp(){
        this.departmentServiceImp=new DepartmentServiceImp(this.departmentRepository);
    }



    @Test
    @Order(1)
    void getDepartment() {
        departmentServiceImp.getDepartment();
        verify(departmentRepository).findAll();
    }

    @Test
    @Order(2)
    void addDepartment() {
        Department department=new Department("03","myntra","159");

        when(departmentRepository.save(department)).thenReturn(department);
        assertEquals(department,departmentServiceImp.addDepartment(department));

    }
    @Test
    @Order(3)
    void updateDepartment() {
        Department department=new Department("05","amazon","159");

        when(departmentRepository.save(department)).thenReturn(department);
        assertEquals(department,departmentServiceImp.updateDepartment(department));
    }
    @Test
    @Order(4)
    void deleteDepartment() {
            String dId = "03";
            departmentServiceImp. deleteDepartment(dId);
            verify(departmentRepository,times(1)).deleteById(Integer.valueOf(dId));
        }
    }


