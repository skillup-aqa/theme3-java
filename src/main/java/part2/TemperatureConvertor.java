package part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        // TODO: Implement solution here
        return celsius * 9 / 5 + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // TODO: Implement solution here
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void requestInputAndCalculate() {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter numeric value of temp for С or F:");
        double temperature = in.nextDouble();
        System.out.println("choose C or F ");

        String unit = in.next();
        if (unit == "F") {
            System.out.println("temp in C:" + convertFahrenheitToCelsius(temperature));
//        } else if (unit == "C") {
//            System.out.println("temp in F:" + convertCelsiusToFahrenheit(temperature));
            // не зміг розібратися по якій причині при вводі F - виводить F, а не С, та ще ы неправильно конвертує.
            // Бавився з if else if, while do break, але не вийшло.
        } else {
         System.out.println("temp in F:" + convertCelsiusToFahrenheit(temperature));
        }




    }

    public static void main(String[] args) {
        requestInputAndCalculate();
    }
}
