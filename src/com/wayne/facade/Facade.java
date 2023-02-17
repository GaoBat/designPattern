package com.wayne.facade;
//外观模式:为子系统的接口提供一组统一的入口.外观模式定义了一个高层接口,这个接口使得子系统更加容易使用
//外观模式是迪米特法则的一种具体实现,通过引入一个外观角色降低原有系统的复杂度,同时降低客户类与子系统的耦合度.
//此处复习一下迪米特法则的内容描述
//迪米特法则:每一个软件单元对其他单元都只有最少的信息,而且局限于那些与本单元密切相关的软件单元
//迪米特法则要求一个软件实体应该尽可能少地与其他实体发生相互作用.
public class Facade {
    private SubSystemA subA = new SubSystemA();
    private SubSystemB subB = new SubSystemB();
    private SubSystemC subC = new SubSystemC();
    public void method(String s){
        String resA = subA.methodA(s);
        String resB = subB.methodB(resA);
        subC.methodC(resB);
    }
}
