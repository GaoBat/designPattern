package com.wayne.adapter;
//适配器模式
//将一个类的接口转换成客户希望的另外一个接口.
//adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作
//将两个不兼容的类纠合在一起使用,属于结构性模式,需要有adaptee(被适配者)
//和adaptor(适配器)两个身份
//为何使用?
//我们经常碰到要将两个没有关系的类组合在一起使用
//第一解决方案是:修改各自类的接口,但是如果我们没有源代码,或者,我们不愿意为了
//一个应用而修改各自的接口,怎么办
//使用adapter,在这两种接口之间创建一个混血接口
//如何使用?
//实现adapter方式,有两种方式:组合(composition)和继承
//假设我们要打桩,有两种类:方形桩和圆形桩
public class RoundPeg implements IRoundPeg{
    public void insertIntoHole(String msg){
        System.out.println("RoundPeg insertIntoHole():"+msg);
    }
}
