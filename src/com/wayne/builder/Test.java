package com.wayne.builder;
//在java实际使用中,我们经常用到池(pool)的概念,当资源提供者无法提供足够的资源
//并且这些资源需要被很多用户反复共享时,就需要使用池
//池实际是一段内存,当池中有一些复杂的资源'断肢'(比如数据库的连接池,也许有时一个链接会中断),如果循环
//再利用这些'断肢',将提高内存使用效率,提高池的性能,修改builder模式中的director类使之能诊断
//'断肢'断在哪个部件上,再修复这个部件
//builder:实现者 director:执行者
public class Test {
    public static void main(String[] args) {
        ConcreteBuilder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        director.construct();
        Product product=builder.getResult();
    }
}
