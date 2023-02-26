package com.learning.hr_sys.pojo;

import java.util.Date;

public class Employee {
    private String employeeID;
    private String employeeName;
    private enum gerder {Male,Female};;
    private Date birthday;
    private enum employeeStatus {Active,Inactive};
    private int telNumber;
    private Date startingTime;
    private double totalSalary;
    private int origanizationID;
    private int jobTitleID;
}

