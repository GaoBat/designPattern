package com.wayne.bridge;

public class CoffeeImpSingleton {
    private static CoffeeImp coffeeImp;

    public CoffeeImpSingleton(CoffeeImp coffeeImp) {
        this.coffeeImp=coffeeImp;
    }

    public static CoffeeImp getTheCoffeeImp(){
        return coffeeImp;
    }
}
