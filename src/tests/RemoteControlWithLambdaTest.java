import com.patterns.command.instrumentation.GarageDoor;
import com.patterns.command.instrumentation.Light;
import com.patterns.command.instrumentation.RemoteControl;
import org.junit.jupiter.api.Test;

public class RemoteControlWithLambdaTest {

    @Test
    public void simpleTest() {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, garageDoor::up, garageDoor::down);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
