package com.laikacode.javatest.discount;


import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount;

    public PriceCalculator() {
    }

    public PriceCalculator(double discount) {
        this.discount = discount;
    }

    public double getTotal() {

        double result = 0;

        for (Double price : prices) {
            result += price;
        }

        return result - (result * (discount / 100));
    }

    public void addPrice(double price){
        this.prices.add(price);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
