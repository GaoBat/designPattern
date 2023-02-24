package com.wayne.template;

//template模板模式定义:
//定义一个操作中算法的骨架,将一些步骤的执行延迟到子类中
//使用java的抽象类时,就经常会使用到template模式,因此template模式使用很普遍
//而且很容易理解和使用
public abstract class Benchmark {
    //下面操作是我们希望在子类中完成
    public abstract void benchmark();

    //重复执行benchmark次数
    public final long repeat(int count) {
        if (count <= 0)
            return 0;
        else {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < count; i++)
                benchmark();
            long stopTime = System.currentTimeMillis();
            return stopTime - startTime;
        }
    }
}
