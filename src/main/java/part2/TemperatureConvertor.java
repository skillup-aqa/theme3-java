package part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        // TODO: Implement solution here
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // TODO: Implement solution here
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void requestInputAndCalculate() {
        // TODO: Put here the request for temperature and scale
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter temperature");
        double celsius = temperature.nextDouble();
        double fahrenheit = temperature.nextDouble();
        System.out.println("Fahrenheit " + (celsius * 9 / 5) + 32);
        System.out.println("Celsius" + (fahrenheit - 32) * 5 / 9);
    }

    public static void main(String[] args) {
        requestInputAndCalculate();
    }

}
