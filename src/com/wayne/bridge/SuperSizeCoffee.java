package com.wayne.bridge;

public class SuperSizeCoffee extends Coffee{
    public SuperSizeCoffee(){
        setCoffeeImp();
    }
    @Override
    public void pourCoffee() {
        CoffeeImp coffeeImp=this.getCoffeeImp();
        //5代表大杯
        for (int i = 0; i < 5 ; i++) {
            coffeeImp.pourCoffeeImp();
        }
    }
}
