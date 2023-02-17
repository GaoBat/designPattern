package com.wayne.proxy;

public class PhoneServiceImpl implements PhoneService{
    @Override
    public void buyPhone(int num) {
        System.out.printf("手机进货%d部\n",num);
    }

    @Override
    public void salePhone(int num) {
        System.out.printf("手机销售%d部\n",num);
    }
}
