package com.learning.hr_sys.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import java.io.Serializable;
import java.util.Date;


@Data
public class Employee implements Serializable {
    private Integer employeeID;
    private String employeeName;
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date birthday;
    private int activeStatus;
    private int telNumber;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date contractStartingTime;
    private double totalSalary;
    private int origanizationID;
    private int jobtitleID;
    @Override
    public String toString()
    {
        return "Employee{"+
                "id=" + employeeID +
                ", name='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", status=" + activeStatus +
                ", phone='" + telNumber + '\'' +
                ", contractStartingTime='" + contractStartingTime + '\'' +
                ", salary='" + totalSalary + '\'' +
                ", origanization=" + origanizationID +
                ", jobtotileID=" + jobtitleID +
                '}';
    }
   /*
       由于使用Lombok的Getter、Setter写法，所以暂时不需要按照这种方式来写基础的get、set方法
    public void setEmployeeID(Integer id) { this.employeeID = id; }
    public Integer getEmployeeID(){return employeeID;}
    public void setEmployeeName(String Name){this.employeeName = Name;}
    public String getEmployeeName(){return employeeName;}
    public void setGender(String gender){this.gender = gender;}
    public String getGender(){return gender;}
    public void setBirthday(Date birthday){this.birthday = birthday;}
    public Date getBirthday(){return birthday;}
    public void setActiveStatus(boolean Status){this.activeStatus = Status;}
    public boolean getActiveStatus(){return activeStatus;}
    public void setTelNumber(int telNumber){this.telNumber = telNumber;}
    public int getTelNumber(){return telNumber;}
    public void setContractStartingTime(Date startingTime){this.contractStartingTime = startingTime;}
    public Date getContractStartingTime() { return contractStartingTime;}
    public void setTotalSalary(double salary){this.totalSalary = salary;}
    public double getTotalSalary(){return totalSalary;}

    */




}

