package com.wayne.factory;
//为什么工厂模式是如此常用?因为工厂模式就相当于创建实例对象的new,我们经常要根据类Class生成实例对象
//如A a=new A() 工厂模式也是用来创建实例对象的,所以以后new时就要多个心眼,是否可以考虑实用工厂模式
//虽然这样做,可能多做一些工作,但会给你系统带来更大的可扩展性和尽量少的修改量
//工厂模式中有: 工厂方法(Factory Method)和抽象工厂(Abstract Factory)
//工厂方法(常用)
public class Factory {
    public static Sample creator(int which) {
        if (which == 1) {
            return new SampleA();
        } else if (which == 2) {
            return new SampleB();
        } else {
            return null;
        }
    }
    //那么在你的程序中,如果要实例化Sample时,就使用
/*    public static void main(String[] args) {
        Sample sampleA=Factory.creator(1);
    }*/
//    这样,在整个就不涉及到Sample的具体子类,达到封装效果,也就减少错误修改的机会,这个原理可以用很通俗的话来比喻:就是具体事情做得越多,越容易范错误
//    这每个做过具体工作的人都深有体会,相反,官做得越高,说出的话越抽象越笼统,范错误可能性就越少
//    使用工厂方法,要注意几个角色,首先你要定义产品接口,如上面的Sample,产品接口下有Sample接口的实现类
//    如SampleA,其次要有一个factory类,用来生成产品Sample
}


