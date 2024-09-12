package part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static <Char> void requestInputAndCalculate() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature number:");
        double temperature = scan.nextDouble();


        System.out.println("Enter the unit of measurement (F or C):");
        String userUnitOfMeasurement =  scan.next();

        if (userUnitOfMeasurement == "C")
            System.out.println("Temperature in F:" + convertCelsiusToFahrenheit(temperature));
        else{
            System.out.println("Temperature in C:" + convertFahrenheitToCelsius(temperature));
        }

    }

    public static void main(String[] args) {
        requestInputAndCalculate();
    }
}
