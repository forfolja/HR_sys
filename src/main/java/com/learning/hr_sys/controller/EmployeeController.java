package com.learning.hr_sys.controller;

import com.learning.hr_sys.pojo.Employee;
import com.learning.hr_sys.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public RespBean addEmp(@RequestBody Employee employee) {
        if (employeeService.addEmployee(employee) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }



}
