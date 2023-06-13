package com.patterns.decorator.toppings;

import com.patterns.decorator.coffee.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
