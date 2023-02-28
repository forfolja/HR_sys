package com.learning.hr_sys.service;

import com.learning.hr_sys.Mapper.*;
import com.learning.hr_sys.pojo.*;
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

    public Integer updateEmployee(Employee aEmployee)
    {
        Date contractStartingTime = aEmployee.getContractStartingTime();
        String organizationName = aEmployee
    }

    public Integer addOganization(Organization aOrganization)
    {
        String organizationName = aOrganization.getOrganizationName();
        Integer organizationID = aOrganization.getorganizationID();

    }
}
