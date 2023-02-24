package com.wayne.template;

//在上例Benchmark中,我们希望重复执行benchmark()操作,但是对benchmark()的具体内容
//没有说明,而是延迟到其子类中描述
public class MethodBenchmark extends Benchmark{
    //真正定义benchmark内容
    @Override
    public void benchmark() {
        System.out.println("batman");
    }
}
