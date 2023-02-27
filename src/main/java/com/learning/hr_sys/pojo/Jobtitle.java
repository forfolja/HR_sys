package com.learning.hr_sys.pojo;

public class Jobtitle {

    private String jobtitleID;
    private String jobType;
    private String jobtitleName;
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
    private int jobtitleLevel;
    private double jobtitleBonusIndex;
    private enum jobtitleStatus{Active,Inactive};
}
