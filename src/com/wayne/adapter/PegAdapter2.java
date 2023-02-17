package com.wayne.adapter;

public class PegAdapter2 implements IRoundPeg,ISquarePeg{
    private RoundPeg roundPeg;

    private SquarePeg squarePeg;

    public PegAdapter2(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    public PegAdapter2(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public void insertIntoHole(String msg) {

    }

    @Override
    public void insert(String str) {
        roundPeg.insertIntoHole(str);
    }
}
