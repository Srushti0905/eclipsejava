package com.mmcoe.stock;

public class Stock implements Exchange {

    @Override
    public void setData() {
        System.out.println("Set details");
    }

    @Override
    public void getData() {
        System.out.println("Get details");
    }

    @Override
    public void viewData() {
        System.out.println("View details");
    }
}