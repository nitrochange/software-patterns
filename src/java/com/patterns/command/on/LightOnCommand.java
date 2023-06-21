package com.patterns.command.on;

import com.patterns.command.Command;
import com.patterns.command.instrumentation.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
