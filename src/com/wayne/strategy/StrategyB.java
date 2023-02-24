package com.wayne.strategy;
//为春节准备的促销活动B
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("B");
    }
}