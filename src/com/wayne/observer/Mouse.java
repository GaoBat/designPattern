package com.wayne.observer;

public class Mouse implements MyObserver{
    @Override
    public void response() {
        System.out.println("老鼠努力逃跑!");
    }
}
