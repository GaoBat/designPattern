package com.wayne.adapter;

public class Test {
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg();
        PegAdapter pegAdapter=new PegAdapter(roundPeg);
        pegAdapter.insert("?");
    }
}
