package com.wayne.decorator;
//具体构件
public class ConcreteComponent extends Component{

    //具体实践
    @Override
    public void operate() {
        System.out.println("这里是具体构件,实现了抽象构件中的方法");
    }
}
