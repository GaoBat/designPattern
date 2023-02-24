package com.wayne.command;

import java.util.Scanner;
//概述:
//命令模式可以将请求发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求.
//定义:将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作.
//也叫为动作(action)模式或事务(transaction)模式.
//命令模式是一种对象行为型模式
//客户角色:创建一个具体命令对象(并可以设定它的接收者)
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command turnOn = new TurnOnCommand(receiver);
        Command turnOff = new TurnOffCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setTurnOnCommand(turnOn);
        invoker.setTurnOffCommand(turnOff);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        try {
            if ("ON".equals(input)) {
                invoker.turnUp();
            } else if ("OFF".equals(input)) {
                invoker.turnDown();
            } else {
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
            }
        } catch (Exception e) {
            System.out.println("Arguments required.");
        }
    }
}
