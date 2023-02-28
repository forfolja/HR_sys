package com.learning.hr_sys.pojo;

import lombok.Data;

@Data
public class Salary {
    private Integer salaryId;
    private double salary;
    private enum salaryType{BASE,BONUS};
}
