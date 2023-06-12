package com.patterns.observer.implementation;

import com.patterns.observer.interfaces.DisplayElement;
import com.patterns.observer.interfaces.Observer;
import com.patterns.observer.interfaces.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
    @Override
    public void display() {
        System.out.println("Observer: " + this + " temperature: " +temperature
            +" humidity: " + humidity);
    }
}
