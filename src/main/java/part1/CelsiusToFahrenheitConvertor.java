public class ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {
        double C1 = 0;
        int a = C1 * 9 / 5;
        int b = a + 32;
        double F1 = b;
        System.out.println(F1);

        double C2 = 100;
        int a1 = C2 * 9 / 5;
        int b1 = a1 + 32;
        double F2 = b1;
        System.out.println(F2);

        double C3 = 37;
        int a2 = C3 * 9 / 5;
        int b2 = a2 + 32;
        double F3 = b2;
        System.out.println(F3);
        
        
        System.out.println(convertCelsiusToFahrenheit(0)); // Expected output: 32.0
        System.out.println(convertCelsiusToFahrenheit(100)); // Expected output: 212.0
        System.out.println(convertCelsiusToFahrenheit(37)); // Expected output: 98.6
    }
}
