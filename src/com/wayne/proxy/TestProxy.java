package com.wayne.proxy;
//静态代理总结
//缺点:每一个目标对象,都需要匹配一个代理类,并且目标对象方法变更,代理类必须同步更新
//目标对象:具体的业务
//代理对象:执行的过程中真正的运行的对象
public class TestProxy {
    public static void main(String[] args) {
        ProxyStaticInterface proxyStaticInterface=new ProxyStaticInterface();
        proxyStaticInterface.buyPhone(200);
        ProxyStaticExtents proxyStaticExtents= new ProxyStaticExtents();
        proxyStaticExtents.salePhone(200);
    }
}
