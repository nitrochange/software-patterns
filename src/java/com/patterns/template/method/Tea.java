package com.patterns.template.method;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steepinig the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
