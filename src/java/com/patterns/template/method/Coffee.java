package com.patterns.template.method;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
