package com.patterns.adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying for short distance");
    }
}
