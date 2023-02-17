package com.wayne.flyweight;
//https://blog.csdn.net/qq_38762212/article/details/125351130
//享元模式:运用共享技术有效的支持大量细粒度对象的复用
//通过池技术来保存大量相似或相同(指同一类型或继承同一父类)的对象,
//暴露其共同的属性隐藏私有属性来进行反复的使用
//在享元模式中可以共享出来的部分成为内部状态,而其中不被共享的部分成为外部状态
//这样使得这一堆对象既可以使用共同的方法,也可以强制转型后使用自己的特有方法
//在享元模式中我们通常通过创建一个工厂来负责维护我们的享元池,其重要作用就是存储大量具有
//相同内部状态的享元对象
//享元模式被广泛用于池技术上,像我们频繁接触的数据库连接池其实就是享元模式的体现

//角色与职责
//flyweight:
//定义一个接口,通过这个接口可以改变享元对象内部状态
//定义一些享元对象应该公有的方法
//
//concreteFlyweight:
//实现了flyweight接口,并且具有自己私有的外部状态/属性等
//可以拥有自己的私有方法,不需要共享给外部
//
//unsharedConcreteFlyweight:
//一些不需要共享的flyweight子类
//
//flyweightFactory:
//享元工厂
//具有创建和管理享元对象的功能
//为用户提供共享的享元对象,且用户不可以直接的创建享元对象,必须通过享元工厂
public class Test {
    public static void main(String[] args) {
        BasePowerBankFlyWeight powerBank1 = PowerBankBox.usePowerBank(2);
        powerBank1.use();
        BasePowerBankFlyWeight powerBank2 = PowerBankBox.usePowerBank(null);
        powerBank2.use();
        powerBank2.endUse();
        BasePowerBankFlyWeight powerBank3 = PowerBankBox.usePowerBank(null);
        powerBank3.use();
    }
}
