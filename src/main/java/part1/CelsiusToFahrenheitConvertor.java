package part1;
public class CelsiusToFahrenheitConvertor {

    public static double celsiusToFahrenheitConvertor(double celsius) {
       double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheitConvertor(0)); // Expected output: 32.0
        System.out.println(celsiusToFahrenheitConvertor(100)); // Expected output: 212.0
        System.out.println(celsiusToFahrenheitConvertor(37)); // Expected output: 98.6
    }
}
