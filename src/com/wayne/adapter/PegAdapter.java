package com.wayne.adapter;
//现在有一个应用,需要既打方形桩,又打圆形桩.那么我们需要将这两个没有关系的类综合应用.
//假设roundPeg我们没有源代码或者源代码我们不想修改,那么我们使用adapter来实现应用
public class PegAdapter extends SquarePeg{
    private RoundPeg roundPeg;
    public PegAdapter(RoundPeg peg){
        this.roundPeg=peg;
    }
    public void insert(String str){
        roundPeg.insertIntoHole(str);
    }
}
//在上面代码中,roundPeg属于adaptee,是被适配者.pegAdapter是adapter,将adaptee(被适配者roundPeg)和
//target(目标squarePeg)进行适配.实际上这是将组合方法(composition)和继承方法综合运用
//petAdapter首先继承squarePeg,然后使用new的组合生成对象方式,生成roundPeg的对象roundPeg,再重载父类
//insert().从这里,你也了解使用new生成对象和使用extends继承生成的对象不同,前者无需对原来的类修改,
//甚至无需要知道其内部结构和源代码
