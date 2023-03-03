package com.wayne.singleton;
//https://blog.csdn.net/weixin_47651920/article/details/123184488
//创建模式:单例模式(饿汉)
//保证一个类只有一个实例,并提供一个访问它的全局访问点
//Singleton模式主要作用就是保证在java应用程序中,一个类Class只有一个实例存在,限制了实例的个数
public class SingletonDemo1 {
    private SingletonDemo1(){}
    //在自己内部定义自己一个实例,是不是很奇怪?
    //注意这是private只供内部调用
    private static SingletonDemo1 instance = new SingletonDemo1();
    //这里提供一个供外部访问本class的静态方法,可以直接访问
    public static SingletonDemo1 genInstance(){
        return instance;
    }
}