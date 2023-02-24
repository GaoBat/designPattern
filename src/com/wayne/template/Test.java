package com.wayne.template;
//repeat()方法为模板方法,它其中的benchmark()实现被延迟到子类
//methodBenchmark中实现了
public class Test {

    public static void main(String[] args) {
        Benchmark operation = new MethodBenchmark();
        long duration = operation.repeat(100000);
        System.out.println("The operation took " + duration + " milliseconds");
    }

}
