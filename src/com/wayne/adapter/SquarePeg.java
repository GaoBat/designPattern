package com.wayne.adapter;

public class SquarePeg implements ISquarePeg{
    public void insert(String str){
        System.out.println("SquarePeg insert():"+str);
    }
}
