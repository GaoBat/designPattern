package com.wayne.mediator;


/**
 * 抽象的中介者
 */
public interface Mediator {

    /**
     * 中介者来使各同事之间的联系
     * @param content 交流内容
     * @param toColleagueNames 被联系者的名字
     */
    void contact(String content,Colleague colleague,String ... toColleagueNames);

    /**
     * 添加同事
     * @param colleague 被添加的同事
     */
    void addColleague(Colleague colleague);
}