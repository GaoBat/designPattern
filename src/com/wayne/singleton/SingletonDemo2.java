package com.wayne.singleton;

//(懒汉)
//使用Singleton.getInstance()可以访问单例类
//第二种形式是lazy initialization,也就是第一次调用时初始Singleton,以后就不用再生成了
//注意lazy initialization形式中的synchronized,这个synchronized很重要
//如果没有synchronized,那么使用getInstance()是有可能得到多个Singleton实例
//一般认为第一种形式更加安全些
public class SingletonDemo2 {
    private static SingletonDemo2 instance = null;

    public static synchronized SingletonDemo2 getInstance() {
        //这个方法比上面的有所改进,不用每次都进行生成对象,只是第一次
        //使用时生成实例,提高了效率
        if (instance == null)
            instance = new SingletonDemo2();
        return instance;
    }
}
