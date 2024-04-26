package part3;

public class MathCalculator {
    public static int sumPositiveNumbersToN(int n) {
        // Consider 0 as a positive number
        int sum = 0;
        for (int i = 1; i <= n; i++ ) {
            sum += i;
        } return sum;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPrime(int n) {
        // Consider 1 and negative numbers as non-prime
        if (n <= 1 ) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        } return true;
    }

    public static boolean isArmstrongNumber(int n) {
        int sum = 0;
     int original = n;
     int digits = 0;
     while (n > 0) { digits++; n /= 10; }
     n = original;
     while (n > 0) { int digit = n % 10;
         sum += (int) Math.pow(digit, digits); n /= 10; }
        return sum == original;
    }

    public static void printFibonacciNumbers(int n) {
        int first = 0; int second = 1;
        System.out.println(first); System.out.println(second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.println(next);
            first = second; second = next; }
    }

    public static void printDigitsReversed(int n) {
        // Use System.out.print() to print the digits without new line
        while (n > 0) { int digit = n % 10; System.out.println(digit);
            n /= 10; }

    }

    public static void main(String[] args) {
        printFibonacciNumbers(10);
        printDigitsReversed(12345);

        int n = 5;
        System.out.println("Sum of positive numbers up to " + n + " is " + sumPositiveNumbersToN(n));
        System.out.println(n + " factorial is " + factorial(n));
        System.out.println(n + " is prime: " + isPrime(n));
        System.out.println(n + " is Armstrong number: " + isArmstrongNumber(n));
    }
}
