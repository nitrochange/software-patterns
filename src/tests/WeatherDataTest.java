import com.patterns.observer.implementation.CurrentConditionsDisplay;
import com.patterns.observer.implementation.WeatherData;
import org.junit.jupiter.api.Test;

import java.util.Observer;

public class WeatherDataTest {

    @Test
    public void observerSimpleTest() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay1 = new CurrentConditionsDisplay(weatherData);
        //invoke event for only 1 observer
        weatherData.setMeasurements(50, 500, 43);

        CurrentConditionsDisplay currentConditionsDisplay2 = new CurrentConditionsDisplay(weatherData);
        //invoke event for 2 observers
        weatherData.setMeasurements(43,21,43);

        //unsubscribe first display and run event only for second observer
        weatherData.removeObserver(currentConditionsDisplay1);
        weatherData.setMeasurements(65,65,65);
    }
}
