package com.wayne.command;
//具体命令对象:将一个接收者对象绑定于一个动作,调用接收者相应的操作,以实现命令角色的执行操作的的接口
public class TurnOnCommand implements Command {

    private Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }
}
