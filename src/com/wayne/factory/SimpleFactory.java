package com.wayne.factory;

public class SimpleFactory extends Factory2{

    @Override
    public Sample creator() {
        return new SampleA();
    }

    @Override
    public Sample2 creator(String name) {
        return new Sample2A();
    }
}
