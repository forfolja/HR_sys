package com.learning.hr_sys.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Employee {
    private String employeeID;
    private String employeeName;
    private enum gender {Male,Female};
    @Override
    public String toString()
    {
        return "Employee{"+
                "id=" + employeeID +
                ", name='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", status=" + employeeStatus +
                ", phone='" + telNumber + '\'' +
                ", startingTime='" + startingTime + '\'' +
                ", salary='" + totalSalary + '\'' +
                ", origanization=" + origanizationID +
                ", jobtotileID=" + jobtitleID +
                '}';
    }
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date birthday;
    private enum employeeStatus {Active,Inactive};
    private int telNumber;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date startingTime;
    private double totalSalary;
    private int origanizationID;
    private int jobtitleID;
}

