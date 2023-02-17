package com.wayne.decorator;

//具体的装饰类
public class ConcreteDecorator2 extends Decorator {
    //定义被装饰者
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    private void method2(){
        System.out.println("method2修饰...");
    }
    //重写父类的operate方法
    public void operate(){
        this.method2();
        super.operate();
    }
}
