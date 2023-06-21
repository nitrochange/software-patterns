package com.patterns.command;

import com.patterns.command.instrumentation.GarageDoor;

public class GarageDoorCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

}
