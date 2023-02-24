package com.wayne.observer;

import java.util.ArrayList;

//观察者模式主要解决一个对象状态改变给其他对象通知的问题,而且要考虑到易用和低耦合,
//保证高度的协作,通过上面的例子我们对该模式已经有了一定的认知,如果要一句话来解释观察者模式呢,大概就是:
//定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并被自动更新.
//观察者模式又叫做发布-订阅(Publish/Subscribe)模式,
//模型-视图(Model/View)模式;源-监听器(Source/Listener)模式或从属者(Dependents)模式.观察者模式是一种对象行为型模式.

//抽象目标类:用于存储观察者对象,并定义注册方法和注销方法,
//同时声明了抽象的通知方法
public abstract class MySubject {
    protected ArrayList observers = new ArrayList();

    //注册方法
    public void attach(MyObserver observer){
        observers.add(observer);
    }

    //注销方法
    public void detach(MyObserver observer){
        observers.remove(observer);
    }

    public abstract void cry(); //抽象通知方法
}
