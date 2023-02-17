package com.wayne.bridge;

public abstract class Coffee {
    CoffeeImp coffeeImp;
    public void setCoffeeImp(){
        this.coffeeImp=CoffeeImpSingleton.getTheCoffeeImp();
    }

    public CoffeeImp getCoffeeImp() {
        return coffeeImp;
    }

    public abstract void pourCoffee();
}
