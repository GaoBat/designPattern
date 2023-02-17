package com.wayne.flyweight;
//具体享元类
public class PowerBank extends BasePowerBankFlyWeight{
    private Integer id;
    private String brand;

    public PowerBank(Integer id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    void use() {
        System.out.println("编号:"+id+"品牌:"+brand+" 的充电宝正在使用中");
        this.inUse = true;
    }

    @Override
    void endUse() {
        System.out.println("编号:"+id+"品牌:"+brand+" 的充电宝使用结束,已放回");
        this.inUse = false;
    }
}
