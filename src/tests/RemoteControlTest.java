import com.patterns.command.Command;
import com.patterns.command.instrumentation.Light;
import com.patterns.command.instrumentation.RemoteControl;
import com.patterns.command.instrumentation.Stereo;
import com.patterns.command.off.LightOffCommand;
import com.patterns.command.off.StereoOffWithCDCommand;
import com.patterns.command.on.LightOnCommand;
import com.patterns.command.on.StereoOnWithCDCommand;
import org.junit.jupiter.api.Test;

public class RemoteControlTest {

    @Test
    public void simpleTest() {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command onCommand1 = new LightOnCommand(light);
        Command offCommand1 = new LightOffCommand(light);
        remoteControl.setCommand(0, onCommand1, offCommand1);

        Stereo stereo = new Stereo();
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffWithCDCommand);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);

        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
    }
}
