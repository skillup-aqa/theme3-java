package part1;
import java.util.Scanner;
public class CelsiusToFahrenheitConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter C");
        double x = scan.nextDouble();
        int a = 9;
        int b = 5;
        int c = 32;

        double F = (x * a / b) + c;
        System.out.println(F);
        return F;
    }


    public static void main(String[] args) {
   System.out.println(convertCelsiusToFahrenheit(0)); // Expected output: 32.0
    System.out.println(convertCelsiusToFahrenheit(100)); // Expected output: 212.0
 System.out.println(convertCelsiusToFahrenheit(37)); // Expected output: 98.6
    }
}
