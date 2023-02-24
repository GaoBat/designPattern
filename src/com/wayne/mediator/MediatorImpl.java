package com.wayne.mediator;

import java.util.HashMap;
import java.util.Map;

public class MediatorImpl implements Mediator{

    //维护并知道所有同事
    private Map<String,Colleague> colleagueMap = new HashMap<>();

    @Override
    public void contact(String content, Colleague colleague, String... toColleagueNames) {
        for (String name : toColleagueNames){
            Colleague message = colleagueMap.get(name);
            message.getMessage(content,colleague.getName());
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueMap.put(colleague.getName(),colleague);
    }
}
