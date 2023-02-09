package com.wayne.factory;

public class BombFactory extends Factory2{
    @Override
    public Sample creator() {
        return new SampleB();
    }

    @Override
    public Sample2 creator(String name) {
        return new Sample2B();
    }
//    抽象工厂还有另外一个关键要点,是因为SimpleFactory内,生产Sample和生产Sample2的方法之间有一定联系
//    所以才要将这两个方法捆绑在一个类中,这个工厂类有其本身特征，也许制造过程是统一的,比如:制造工艺比较简单,所以名称叫SimpleFactory
//    在实际应用中,工厂方法用得比较多一些,而且是和动态类装入器组合在一起应用
}
