import com.patterns.adapter.*;
import org.junit.jupiter.api.Test;

public class DuckTestDrive {

    @Test
    public void simpleTest() {
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck adapterDuck = new TurkeyAdapter(turkey);

        System.out.println("Normal duck: ");
        testDuck(mallardDuck);
        System.out.println("Adapter duck");
        testDuck(adapterDuck);
    }

    public void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
