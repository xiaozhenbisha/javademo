package com.atguigu.team.test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import org.junit.Test;

public class NameListServiceTest {

    NameListService nls = new NameListService();

    @Test
    public void testGetAllEmployees(){

        Employee[] employees = nls.getAllEmployees();

        for (Employee employee : employees) {
            System.out.println(employee.getName() + "," + employee.getAge());
        }

    }

    @Test
    public void testGetEmployee(){
        try {
            Employee emp = nls.getEmployee(100);
            System.out.println("获取成功" + emp.getName());
        } catch (TeamException e) {
            System.out.println("获取失败，原因：" + e.getMessage());
        }
    }

}
