package part3;

public class MathCalculator {
    public static int sumPositiveNumbersToN(int n) {
        // Consider 0 as a positive number
        // TODO: Implement solution here
        return -1;
    }

    public static int factorial(int n) {
        // TODO: Implement solution here
        return -1;
    }

    public static boolean isPrime(int n) {
        // Consider 1 and negative numbers as non-prime
        // TODO: Implement solution here
        return false;
    }

    public static boolean isArmstrongNumber(int n) {
        // TODO: Implement solution here
        return false;
    }

    public static void printFibonacciNumbers(int n) {
        // TODO: Implement solution here
    }

    public static void printDigitsReversed(int n) {
        // Use System.out.print() to print the digits without new line
        // TODO: Implement solution here

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
