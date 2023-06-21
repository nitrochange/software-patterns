package com.patterns.command.on;

import com.patterns.command.Command;
import com.patterns.command.instrumentation.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolume(11);
    }


}
