package com.atguigu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CreateProxy implements InvocationHandler {

    private Object target;

    //对外提供代理对象 ----   需要被代理对象
    public Object getProxy(Object target){//itBoy 或  itGirl
        //赋值了
        this.target=target;
        //生成代理对象
        /*
            ① ClassLoader  类加载器(主要就是去加载目标类的和代理对象的类)代理对象类的类加载器，
                            必须和目标对象类的类加载器是同一个
            ② Interfaces   目标对象所属类的所有接口(目的就是设置返回的代理对象实现哪些接口)
                                代理对象和目标对象所实现的接口是一样的
            ③ InvocationHandler  目的是当代理对象调用方法的时候，可以调用到invoke方法
                            代理对象创建的时候，将this传递进去了，代理对象调用任意方法，
                            都相当于调用this的invoke方法(反射完成，其他的InvocationHandler实现类对象也是可以滴)
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
    /*
        真正的代理方法
        ① Object proxy  代理对象
        ② Method method  就是代理对象调用的那个方法的对象(java.lang.reflect.Method)
                案例中method就是buyHouse这个方法
        ③ Object[] args   就是method方法的实参列表
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("找房源、联系房东。。。。。。前期准备工作");
        //客户的核心代码  (老师先将代码写上，回头再结束)
        method.invoke(target,args);//调用target对象的method方法，args是method方法的参数列表
        //itBoy.buyHouse()
        //itGirl.buyHouse()
        System.out.println("准备合同。。。过户。。。。");
        return null;
    }
}
