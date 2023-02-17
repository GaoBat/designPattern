package com.wayne.flyweight;

//抽象享元类:定义充电宝
public abstract class BasePowerBankFlyWeight {
    //维持一个是否在使用中的状态 true:正在使用 false:未使用
    boolean inUse = false;
    //使用充电宝
    abstract void use();
    //结束使用
    abstract void endUse();
}
