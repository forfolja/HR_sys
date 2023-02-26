package com.learning.hr_sys.controller;
import com.learning.hr_sys.pojo.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //修饰成为控制器
public class HelloController
{
    @RequestMapping("/Hello")//修饰成为接口
    public String Hello(){
        return "Hello";
    }
    @RequestMapping("/AddEmployee")
    public String AddEmployee() {
            return employeeID;
    }


}
