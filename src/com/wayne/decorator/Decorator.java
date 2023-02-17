package com.wayne.decorator;

//抽象装饰者,一般为一个抽象类
public abstract class Decorator extends Component{
    //必须有一个private变量指向component抽象构件
    private Component component;
    //通过构造函数传递装饰者
    public Decorator(Component component) {
        System.out.println("这里是抽象类Decortor...");
        this.component = component;
    }

    //委托给被修饰者执行
    @Override
    public void operate() {
        System.out.println("父类的操作方法...");
        this.component.operate();
    }
}
