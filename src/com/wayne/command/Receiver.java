package com.wayne.command;
//接收者:知道如何实施与执行一个请求相关的操作,任何类都可以作为一个接收者
public class Receiver {
    public void turnOn() {
        System.out.println("灯开了！");
    }
    public void turnOff() {
        System.out.println("灯关了！");
    }
}
