package com.in.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "departmentdata")
public class Department {
    @Id
    private String dId;
    private String dName;
    private String employee;

    public Department(String dId, String dName, String employee) {
        this.dId = dId;
        this.dName = dName;
        this.employee = employee;
    }

    public Department() {
    }

    public Department(String dId) {
        this.dId = dId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
