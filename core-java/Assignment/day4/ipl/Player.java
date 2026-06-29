package com.mmcoe.ipl;


public class Player {
    private String name;
    private double bidAmount;

    public Player(String name, double bidAmount) {
        this.name = name;
        this.bidAmount = bidAmount;
    }
    public String getName() {
        return name;
    }

    public double getBidAmount() {
        return bidAmount;
    }
    @Override
    public String toString() {
        return "Player [name=" + name + ", bidAmount=" + bidAmount + "]";
    }
}
//collection string api tp/op unit testing led archie sql