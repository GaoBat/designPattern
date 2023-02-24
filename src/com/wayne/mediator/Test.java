package com.wayne.mediator;
//https://blog.csdn.net/carefree31441/article/details/103511324
//中介者模式:
//定义一个对象来封装一系列对象的交互,中介者模式使各个对象之间不需要相互引用,从而使得其松耦合
//而且用户可以独自地改变它们之间的交互(当这些对象中的某些对象之间的相互作用发生改变时,不会立即
//影响到其他一些对象之间的相互作用,从而保证这些相互作用可以彼此独立地变化)
//如果一个对象中对象之间的联系呈现为网状结构,对象之间存在大量多对多的关系,将导致关系及其复杂
//这些对象被称为"同事对象"
//我们可以引入一个中介者对象,使各个同事对象只跟中介者对象打交道,将复杂的网络结构化解为星形结构
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Colleague colleagueA = new ColleagueImpl("小花",mediator);
        Colleague colleagueB = new ColleagueImpl("小明",mediator);
        Colleague colleagueC = new ColleagueImpl("小绿",mediator);
        Colleague colleagueD = new ColleagueImpl("小蓝",mediator);

        mediator.addColleague(colleagueA);
        mediator.addColleague(colleagueB);
        mediator.addColleague(colleagueC);
        mediator.addColleague(colleagueD);

        colleagueA.contactColleague("大家好",colleagueB.getName(),colleagueC.getName(),colleagueD.getName());

    }
}
