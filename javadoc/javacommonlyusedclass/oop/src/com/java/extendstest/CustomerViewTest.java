package com.java.extendstest;

import org.junit.Before;

public class CustomerViewTest {
    @Before
    public void before(){
        System.out.println("---------测试用例执行前---------");
    }

    @Test
    public void testAddCustomer(){
        System.out.println("addCustomer 方法的测试");
    }

    @Test
    public void testGetAllCustomers(){
        System.out.println("getAllCustomers 方法测试");
    }

    @After
    public void after(){
        System.out.println("----------测试用例执行后-----------");
    }
}
