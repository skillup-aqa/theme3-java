package part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void requestInputAndCalculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temperature = in.nextDouble();

        System.out.println("Enter type of temperature C or F");
        String type = in.next();

        if (type =="C") {
            System.out.println("Temperature in Fahrenheit " + convertCelsiusToFahrenheit(temperature));
        } else if (type =="F") {
            System.out.println("Temperature in Celsius " + convertFahrenheitToCelsius(temperature));
        } else {
            System.out.println("Incorrectly entered type");
        }
    }

    public static void main(String[] args) {
        requestInputAndCalculate();
    }
}
