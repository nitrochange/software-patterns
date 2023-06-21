package com.patterns.command.off;

import com.patterns.command.Command;
import com.patterns.command.instrumentation.Stereo;

public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }


}
