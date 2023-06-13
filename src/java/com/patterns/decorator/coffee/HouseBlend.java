package com.patterns.decorator.coffee;

import com.patterns.decorator.coffee.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
