package com.wayne.proxy;

public class FactoryTest {
    public static void main(String[] args) {
        //创建目标对象，只能是接口类型，不然会报错
        PhoneService phoneService = new PhoneServiceImpl();
        //返回代理对象
        ProxyDynamicInterface<PhoneService>  proxyDynamicInterface = new ProxyDynamicInterface();
        PhoneService proxyObj =  proxyDynamicInterface.getProxyObj(phoneService);
        //具体执行通过代理对象执行
        proxyObj.buyPhone(200);
        proxyObj.salePhone(5);
    }
}
