package com.learning.hr_sys.pojo;

import lombok.*;
@Data
public class SalaryJobtitle {
    private Integer salaryId;
    private double salaryBase;
    private double salaryBonus;
    private  Integer jobtitleID;
    @Override
    public String toString()
    {
        return "SalaryJobtitle{"+
                "id=" + salaryId +
                ", salaryBase='" + salaryBase + '\'' +
                ", salaryBonus='" + salaryBonus + '\'' +
                ", jobtitleID=" + jobtitleID +
                '}';
    }
    ;
}
