package com.wayne.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//充电宝箱子:享元工厂
public class PowerBankBox {
    private static Map<Integer, BasePowerBankFlyWeight> powerBankPool = new HashMap<>();
    private static Integer powerBankNum = 1;

    static {
        //初始化时创建两个充电宝放到充电箱中
        PowerBank powerBank = new PowerBank(powerBankNum++, "罗马仕");
        PowerBank powerBank2 = new PowerBank(powerBankNum++, "小米");
        powerBankPool.put(powerBank.getId(), powerBank);
        powerBankPool.put(powerBank2.getId(), powerBank2);
    }

    //添加一个充电宝到充电箱中
    public void addPowerBank(BasePowerBankFlyWeight powerBank) {
        powerBankPool.put(powerBankNum++, powerBank);
    }

    //取出充电宝
    public static BasePowerBankFlyWeight usePowerBank(Integer num) {
        //首先找到指定的充电宝
        BasePowerBankFlyWeight powerBank = powerBankPool.get(num);
        //如果找不到指定编号的充电宝或者指定编号充电宝正在使用中,则随机返回一个充电宝
        if (Objects.isNull(powerBank) || powerBank.inUse) {
            //遍历连接池中的所有充电宝
            for (BasePowerBankFlyWeight p : powerBankPool.values()) {
                //如果某个充电宝未在使用,则返回这个充电宝
                if (!p.inUse) {
                    return p;
                }
            }
            //循环到最后都没有空闲的充电宝,则返回null
            return null;
        }
        // 如果找到了指定编号的充电宝且没有在使用，直接返回指定充电宝
        return powerBank;
    }
}
