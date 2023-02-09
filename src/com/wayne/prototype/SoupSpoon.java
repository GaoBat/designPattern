package com.wayne.prototype;

//当然也可以结合工厂模式来创建AbstractSpoon实例
//在java中prototype模式变成clone()方法的使用,由于java的纯洁的面向对象特性,使得在java中使用设计模式变
//得很自然,两者已经几乎是浑然一体了,这反映在很多模式上,如interator遍历模式

public class SoupSpoon extends AbstractSpoon{
    public SoupSpoon(){
        setSpoonName("Soup Spoon");
    }
}
