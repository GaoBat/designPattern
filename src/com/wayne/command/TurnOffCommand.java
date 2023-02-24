package com.wayne.command;

//具体命令对象
public class TurnOffCommand implements Command {

    private Receiver receiver;

    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }
}
