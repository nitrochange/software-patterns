package com.patterns.command.instrumentation;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }
    public void setVolume(int volume) {
        System.out.println("Stereo volume is: " + volume);
    }
}
