package part2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TemperatureConvertorTest {

    @Test
    public void testConvertCelsiusToFahrenheit() {
        double celsius = 100;
        double expected = 212;
        double result = TemperatureConvertor.convertCelsiusToFahrenheit(celsius);
        assertEquals(expected, result);

    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        double fahrenheit = 212;
        double expected = 100;
        double result = TemperatureConvertor.convertFahrenheitToCelsius(fahrenheit);
        assertEquals(expected, result);
    }
}
