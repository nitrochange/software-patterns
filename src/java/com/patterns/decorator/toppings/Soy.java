package com.patterns.decorator.toppings;

import com.patterns.decorator.coffee.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Beverage";
    }
}
