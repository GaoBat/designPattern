package com.wayne.decorator;
//https://blog.csdn.net/qq_25827845/article/details/51570272
//装饰模式
//动态的给一个对象添加一些额外的职责.就增加功能来说,装饰模式比生成子类更加灵活
//装饰模式的构成
//抽象构件:是一个接口或者抽象类,就是定义我们最核心的对象,也就是原始的对象
//具体构件:是最核心,最原始,最基本的接口或者抽象类的实现,你要装饰的就是它
//装饰角色:一般是一个抽象类,做什么用呢?实现接口或者抽象方法,它里面可不一定有抽象方法,在它的属性里必然有一个
//private变量指向component抽象构件
//具体装饰角色:
//是两个具体的装饰类,你要把你最核心,最原始,最基本的东西装饰成其他东西
//装饰模式与类继承的区别:
//装饰模式是一种动态行为,对已经存在类进行随意组合,而类的继承是一种静态的行为,一个类定义成什么样的,该类的对象便具有什么样的功能,无法动态的改变.
//装饰模式扩展的是对象的功能,不需要增加类的数量,而类继承扩展是类的功能,在继承的关系中,如果我们想增加一个对象的功能,
//我们只能通过继承关系,在子类中增加两个方法.
//装饰模式是在不改变原类文件和使用继承的情况下,动态的扩展一个对象的功能,它是通过创建一个包装对象,也就是装饰来包裹真是的对象.
//装饰模式的特点:
//装饰对象和真实对象具有相同的接口,这样客户端对象就可以以真实对象的相同的方式和装饰对象交互.
//装饰对象包含一个真实对象的引用(reference)
//装饰对象接受所有来自客户端的请求,它把这些请求转发给真实的对象.
//装饰对象可以在转发这些请求以前或者以后增加一些附加的功能.这样就能确保在运行时,不用修改给定对象结构就可以在外部增加附加的功能.
//在面向对象的程序设计中,通常是使用继承的关系来扩展给定类的功能.
public class Test {
    public static void main(String[] args) {
//要修饰的对象com
Component com=new ConcreteComponent();
//进行第一次修饰
com=new ConcreteDecorator1(com);
//进行第二次修饰
com=new ConcreteDecorator2(com);
com.operate();
    }
}
