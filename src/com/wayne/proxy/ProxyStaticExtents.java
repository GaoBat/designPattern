package com.wayne.proxy;

public class ProxyStaticExtents extends PhoneServiceImpl{
    MyLogUtil logUtil=new MyLogUtil();
    @Override
    public void buyPhone(int num){
        super.buyPhone(num);
        logUtil.log("buyPhone");
    }
    @Override
    public void salePhone(int num){
        super.salePhone(num);
        logUtil.log("salePhone");
    }
}
