package com.patterns.decorator.coffee;

import com.patterns.decorator.coffee.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 2.4;
    }
}
