package com.wayne.mediator;

public class ColleagueImpl extends Colleague{

    public ColleagueImpl(String name,Mediator mediator) {
        super(name,mediator);
    }

    @Override
    public void getMessage(String message, String messageForName) {
        System.out.println("我"+this.getName()+"被"+messageForName+"联系了,"+"信息为:"+message);
    }

    @Override
    public void contactColleague(String message, String... toColleagueNames) {
        System.out.print("我 " + this.getName() + " 向 ");
        for (String toColleagueName : toColleagueNames){
            System.out.print(toColleagueName + ",");
        }
        System.out.println(" 发 " + message + " 信息");
        this.getMediator().contact(message,this, toColleagueNames);
    }
}
