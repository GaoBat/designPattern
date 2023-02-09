package com.wayne.factory;
//这里假设:Sample有两个子类SampleA和SampleB
//而Sample2也有两个子类Sample2A和Sample2B
public abstract class Factory2 {
    public abstract Sample creator();
    public abstract Sample2 creator(String name);
}
