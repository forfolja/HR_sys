package com.learning.hr_sys.pojo;

import lombok.*;

@Data
public class Jobtitle {

    private Integer jobtitleID;
    private String jobType;
    private String jobtitleName;
    private int jobtitleLevel;
    private int jobtitleStatus;
    @Override
    public String toString()
    {
        return "jobtitle{"+
                "id=" + jobtitleID +
                ", type='" + jobType + '\'' +
                ", name='" + jobtitleName + '\'' +
                ", jobtitleLevel=" + jobtitleLevel +
                ", status=" + jobtitleStatus +
                '}';
    }
}
