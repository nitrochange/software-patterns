package com.patterns.command.off;

import com.patterns.command.Command;
import com.patterns.command.instrumentation.Light;

public class LightOffCommand implements Command {

    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
