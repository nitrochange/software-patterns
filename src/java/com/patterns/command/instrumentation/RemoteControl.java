package com.patterns.command.instrumentation;

import com.patterns.command.Command;
import com.patterns.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command command = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = command;
            offCommands[i] = command;
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonWasPushed(int index ) {
        onCommands[index].execute();
    }

    public void offButtonWasPushed(int index) {
        offCommands[index].execute();
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("-----Remote Control-----\n");
        for (int i = 0; i < 7; i++) {
            str.append("[" + i + "] " + "[on]: " + onCommands[i].getClass().getSimpleName() + " [off]: " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return str.toString();
    }
}
