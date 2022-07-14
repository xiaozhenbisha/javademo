package com.atguigu.proxy;
/*
    动态代理的实现步骤    难(一次性理解是不容易的)
        1. 新建一个创建代理对象的类(店铺)
        2. 实现一个接口InvocationHandler
        3. 实现一个抽象方法  invoke
        4. 类种创建一个方法，对外提供代理对象
        5. 代理对象通过Proxy类去创建

        Spring框架-->AOP(面向切面编程)   Spring框架中实现AOP采用的就是动态代理

        静态代理和动态代理的区别是什么呢？
 */
public class Test2 {
    public static void main(String[] args) {
        //2. 动态代理(中介的店铺,可以服务很多个客户)   难(反射知识点)
        //a. 创建被代理对象
        ItBoy itBoy=new ItBoy();
        //b. 创建店铺对象
        CreateProxy createProxy=new CreateProxy();
        //3. 从店铺中获得代理对象

        People proxy = (People)createProxy.getProxy(itBoy);//可以强转成itBoy的任何一个父接口类型(回头可以尝试两个父接口)
        proxy.buyHouse();//真正执行的是InvocationHandler中invoke方法
        //代理对象调用buyHouse，调用到invoke方法，代理对象内部通过反射操作的()


        ItGirl itGirl=new ItGirl();
        People proxy1=(People) createProxy.getProxy(itGirl);
        proxy1.buyHouse();

    }
}
