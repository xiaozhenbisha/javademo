package com.atguigu.java;

public class LoginTest {


    public static void main(String[] args) {
        try {
            login("admin", "126");
        } catch (UsernamePasswordErrorException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }














    //模拟登陆功能
    public static void login(String username, String password){
        if("admin".equals(username) && "123456".equals(password)){
            System.out.println("登陆成功！");
        }else{
            throw new UsernamePasswordErrorException("用户名或密码错误！");
        }
    }
}
