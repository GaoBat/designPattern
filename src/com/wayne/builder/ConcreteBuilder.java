package com.wayne.builder;
//builder的具体实现ConcreteBuilder
//通过具体完成接口builder来构建或装配产品的部件
//定义并明确它所要构建的是什么东西
//提供一个可以重新获取产品的接口
public class ConcreteBuilder implements Builder{

    Part partA,partB,partC;

    @Override
    public void buildPartA() {
        //这里具体如何构建partA的代码
    }

    @Override
    public void buildPartB() {
        //这里具体如何构建partB的代码
    }

    @Override
    public void buildPartC() {
        //这里具体如何构建partC的代码
    }

    @Override
    public Product getResult() {
        //返回最后组装成品结果
        System.out.println("组装完成");
        return null;
    }
}
