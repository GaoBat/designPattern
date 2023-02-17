package com.wayne.decorator;

//具体的装饰类
public class ConcreteDecorator1 extends Decorator {
    //定义被装饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    //定义自己的修饰方法
    private void method1() {
        System.out.println("method1修饰...");
    }

    //重写父类的operate方法
    public void operate() {
        this.method1();
        super.operate();
    }
}
