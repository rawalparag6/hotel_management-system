package com.in.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staffdata")
public class Staff {
    @Id
    private String staffId;
    private String name;
    private String email;
    private String address;
    private String department;
    private int salary;

    public Staff(String staffId, String name, String email, String address, String department, int salary) {
        this.staffId = staffId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.department = department;
        this.salary = salary;
    }

    public Staff() {
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
