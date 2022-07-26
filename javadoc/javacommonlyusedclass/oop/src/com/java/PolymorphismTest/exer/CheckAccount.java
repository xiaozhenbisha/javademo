package com.java.PolymorphismTest.exer;
/**
 * 可透支账户
 */
public class CheckAccount extends Account {
    private double overdraft; //可透支限额

    public CheckAccount() {
    }

    public CheckAccount(int id, double balance, double annualInterstRate, double overdraft){
        super(id, balance, annualInterstRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    //重写父类的取款方法
    public void withdraw(double amount){
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
        }else{//账户余额不够
            //需要透支的额度
            double needOverdraft = amount - getBalance();

            if(needOverdraft > overdraft){
                System.out.println("超过可透支限额！");
            }else{
                setBalance(0.0);
                overdraft -= needOverdraft;
            }
        }
    }
}
