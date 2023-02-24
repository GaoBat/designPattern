package com.wayne.strategy;
//定义: 该模式定义了一些列算法,并将每个算法封装起来,使它们可以相互替换,且算法的变化不会影响算法的客户
//策略模式属于对象行为模式,它通过对算法进行封装,把使用算法的责任和算法的实现分割开来
//并委派给不同的对象对这些算法进行管理
//优点:
//策略类之间可以自由切换,由于策略类都实现同一接口,所以使它们之间可以自由切换
//易于扩展,增加一个新的策略只需要添加一个具体的策略类即可,基本不需要改变原有的代码,符合'开闭原则'
//避免使用多重if else语句,充分体现面向对象设计思想
//缺点:
//客户端必须知道所有的策略类,并自行决定使用哪一个策略类
//策略模式将造成产生很多策略类,可以通过使用享元模式在一定程度上减少对象的数量
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.saleManShow();

        salesMan.setStrategy(new StrategyB());
        salesMan.saleManShow();

        salesMan.setStrategy(new StrategyC());
        salesMan.saleManShow();
    }
}
