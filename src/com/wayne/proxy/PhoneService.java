package com.wayne.proxy;
//代理(proxy)是一种设计模式,提供了对目标对象另外的访问方式:即通过代理对象访问目标对象
//这样的好处是:可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能
//这里使用到编程中的一个思想:不要随意去改变别人已经写好的代码或者方法
//如果需要修改,可以通过代理的方式来扩展该方法

//静态代理
//在某种情况下,客户类不能直接引用目标对象,需要通过代理对象去引用
//一般的代理对象都会有一个接口
//代理对象和目标对象共同实现这个接口
//静态代理(继承、实现接口)和动态代理(基于接口的jdk动态代理,不基于接口的cglib动态代理)
public interface PhoneService {
    void buyPhone(int num);
    void salePhone(int num);
}
