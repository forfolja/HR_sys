package com.learning.hr_sys.service;

import com.learning.hr_sys.Mapper.EmployeeMapper;
import com.learning.hr_sys.Mapper.JobtitleMapper;
import com.learning.hr_sys.Mapper.OrganizationMapper;
import com.learning.hr_sys.Mapper.SalaryMapper;
import com.learning.hr_sys.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    JobtitleMapper jobtitleMapper;

    @Autowired
    OrganizationMapper organizationMapper;

    @Autowired
    SalaryMapper salaryMapper;


    public Integer addEmployee(Employee aEmployee)
    {
        Date contractStartingTime = aEmployee.getContractStartingTime();

    }
}
