package com.wayne.mediator;

public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(String name,Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //得到其他同事发来的消息
    public abstract void getMessage(String message,String messageFormName);

    //与其他同事通信
    public abstract void contactColleague(String message,String ... toColleagueName);
}
