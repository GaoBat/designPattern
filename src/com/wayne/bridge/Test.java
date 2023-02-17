package com.wayne.bridge;
//bridge模式的定义:将抽象和行为划分开来,各自独立,但能动态结合
//一杯咖啡为例,子类实现类为四个:中杯加奶、大杯加奶、 中杯不加奶、大杯不加奶.
//但是,我们注意到:上面四个子类中有概念重叠,可从另外一个角度进行考虑,这四个类实际是两个角色的组合:抽象 和
//行为,其中抽象为:中杯和大杯；行为为:加奶 不加奶(如加橙汁 加苹果汁).
public class Test {
    public static void main(String[] args) {
        //拿出牛奶
        CoffeeImpSingleton coffeeImpSingleton = new CoffeeImpSingleton(new MilkCoffeeImp());
        //中杯加奶
        MediumCoffee mediumCoffee = new MediumCoffee();
        mediumCoffee.pourCoffee();
        //大杯加奶
        SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee();
        superSizeCoffee.pourCoffee();
    }
}
