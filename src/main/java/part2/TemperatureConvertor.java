package part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void requestInputAndCalculate() {
        // TODO: Put here the request for temperature and scale
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter scale 'f' - Fahrenheit 'c' - Celsius, all others - quit: ");
        char scale = scanner.next().charAt(0);
        System.out.println(scale);
        if (scale == 'f' || scale == 'F') {
            System.out.println("Enter temperature in Fahrenheit: ");
            double temperatureInFahrenheit = scanner.nextDouble();
            System.out.println("Degree in Celsius equal is " + convertFahrenheitToCelsius(temperatureInFahrenheit));
        } else if (scale == 'c' || scale == 'C') {
            System.out.println("Enter temperature in Celsius: ");
            double temperatureInCelsius = scanner.nextDouble();
            System.out.println("Degree in Fahrenheit equal is " + convertCelsiusToFahrenheit(temperatureInCelsius));
        } else {
            System.out.println("Quit was executed");
        }

    }

    public static void main(String[] args) {
        requestInputAndCalculate();
    }
}
