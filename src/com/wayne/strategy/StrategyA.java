package com.wayne.strategy;
//为春节准备的促销活动A
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("A");
    }
}
