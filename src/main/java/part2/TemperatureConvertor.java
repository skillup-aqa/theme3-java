package part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void requestInputAndCalculate() {
        Scanner customInput = new Scanner(System.in);
        System.out.println("Enter the temperature value;");
        double temperature = customInput.nextDouble();

        System.out.println("Enter the scale (C for Celsius, F for Fahrenheit):");
        char scale = customInput.next().charAt(0);

        if (scale == 'C' || scale == 'c') {
            double fahrenheit = convertCelsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit:" + fahrenheit);
        } else if (scale == 'F' || scale == 'f') {
            double celsius = convertFahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius:" + celsius);
        } else {
            System.out.println("Enter correct scale");
        }

        customInput.close();
    }

    public static void main(String[] args) {
        requestInputAndCalculate();
    }
}
