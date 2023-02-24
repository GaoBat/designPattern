package com.wayne.observer;

public class Dog implements MyObserver{
    @Override
    public void response() {
        System.out.println("狗跟着叫");
    }
}
