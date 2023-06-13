package com.patterns.decorator.toppings;

import com.patterns.decorator.coffee.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.4 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
