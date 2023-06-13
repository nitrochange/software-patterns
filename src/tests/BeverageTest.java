import com.patterns.decorator.coffee.Beverage;
import com.patterns.decorator.coffee.DarkRoast;
import com.patterns.decorator.coffee.Decaf;
import com.patterns.decorator.toppings.Mocha;
import com.patterns.decorator.toppings.Soy;
import com.patterns.decorator.toppings.Whip;
import org.junit.jupiter.api.Test;

public class BeverageTest {

    @Test
    public void getSomeBeverages() {
        Beverage coffee1 = new DarkRoast();
        coffee1 = new Mocha(coffee1);
        coffee1 = new Soy(coffee1);
        coffee1 = new Whip(coffee1);
        System.out.println(coffee1.getDescription() + " $"+ coffee1.cost());

        Beverage coffee2 = new Decaf();
        coffee2 = new Whip(coffee2);
        coffee2 = new Whip(coffee2);
        coffee2 = new Mocha(coffee2);
        System.out.println(coffee2.getDescription() + " $"+ coffee2.cost());

    }
}
