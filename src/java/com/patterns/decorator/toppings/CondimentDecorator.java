package com.patterns.decorator.toppings;

import com.patterns.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
