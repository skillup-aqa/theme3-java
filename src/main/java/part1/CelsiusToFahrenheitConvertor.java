package part1;

public class CelsiusToFahrenheitConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(0)); // Expected output: 32.0
        System.out.println(convertCelsiusToFahrenheit(100)); // Expected output: 212.0
        System.out.println(convertCelsiusToFahrenheit(37)); // Expected output: 98.6
    }
}
