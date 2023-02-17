package com.wayne.adapter;
//如果我们需要两边继承,即继承squarePeg又继承roundPeg,因为java中不允许
//多继承,但是我们可以实现两个接口
public interface IRoundPeg {
    public void insertIntoHole(String msg);
}
