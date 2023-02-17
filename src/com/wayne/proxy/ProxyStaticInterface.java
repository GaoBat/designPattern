package com.wayne.proxy;
//基于接口的静态代理
public class ProxyStaticInterface implements PhoneService{
    MyLogUtil logUtil=new MyLogUtil();
    @Override
    public void buyPhone(int num) {
        System.out.printf("手机进货%d部\n",num);
        logUtil.log("buyPhone");
    }

    @Override
    public void salePhone(int num) {
        System.out.printf("手机销售%d部\n",num);
        logUtil.log("salePhone");
    }
}
