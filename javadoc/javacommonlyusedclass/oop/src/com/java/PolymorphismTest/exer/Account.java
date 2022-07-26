package com.java.PolymorphismTest.exer;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(){

    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    //存款方法
    public void deposit(double amount){
        balance += amount;
    }

    //取款方法
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("余额不足！");
        }else{
            balance -= amount;
        }
    }
}
