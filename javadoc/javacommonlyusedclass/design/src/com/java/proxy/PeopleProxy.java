package com.java.proxy;

public class PeopleProxy implements People {

    private People target;

    public PeopleProxy(People target) {
        this.target = target;
    }

    @Override
    public void buyHouse() {
        System.out.println("1.找房源，分析是否满足客户的需求,联系房东，背景调查..");
        target.buyHouse();
        System.out.println("准备合同，联系双方，办理过户。。。。");
    }
}
