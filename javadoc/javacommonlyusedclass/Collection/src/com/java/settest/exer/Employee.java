package com.java.settest.exer;

public class Employee {

    private String name;
    private Integer age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, Integer age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    /*@Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee emp = (Employee) o;

            return this.getName().compareTo(emp.getName());
        }

        return 0;
    }*/
}

