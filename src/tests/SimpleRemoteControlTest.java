import com.patterns.command.Command;
import com.patterns.command.GarageDoorCommand;
import com.patterns.command.on.LightOnCommand;
import com.patterns.command.instrumentation.GarageDoor;
import com.patterns.command.instrumentation.Light;
import com.patterns.command.instrumentation.SimpleRemoteControl;
import org.junit.jupiter.api.Test;

public class SimpleRemoteControlTest {

    @Test
    public void lightTest() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command command = new LightOnCommand(light);
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();
    }

    @Test
    public void garageDoorTest() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        Command command = new GarageDoorCommand(garageDoor);
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();
    }
}
