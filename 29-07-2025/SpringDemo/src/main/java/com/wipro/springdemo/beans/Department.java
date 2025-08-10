package com.wipro.springdemo.beans;

public class Department {
	String deptCode;
    String departmentName;

    public Department(String deptCode, String departmentName) {
        this.deptCode = deptCode;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [deptCode=" + deptCode + ", departmentName=" + departmentName + "]";
    }
}
