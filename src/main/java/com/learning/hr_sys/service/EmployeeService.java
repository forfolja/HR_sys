package com.learning.hr_sys.service;

import com.learning.hr_sys.Mapper.*;
import com.learning.hr_sys.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    JobtitleMapper jobtitleMapper;
    @Autowired
    OrganizationMapper organizationMapper;
    @Autowired
    SalaryMapper salaryMapper;

    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");


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
