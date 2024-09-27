package part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + "C is equal to " + fahrenheit + "F");
                break;

            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
                System.out.println(fahrenheitInput + "F is equal to " + celsiusOutput + "C");
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();

    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
