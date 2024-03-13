package part3;

public class MathCalculator {
    public static int sumPositiveNumbersToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int valueOfFactorial = 1;

        if (n == 0) {
            return valueOfFactorial;
        } else {
            int i = 1;
            while (i <= n) {
                valueOfFactorial *= i;
                i++;
            }
        }

        return valueOfFactorial;
    }

    public static boolean isPrime(int n) {
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
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

        int n = 11;
        System.out.println("Sum of positive numbers up to " + n + " is " + sumPositiveNumbersToN(n));
        System.out.println(n + " factorial is " + factorial(n));
        System.out.println(n + " is prime: " + isPrime(n));
        System.out.println(n + " is Armstrong number: " + isArmstrongNumber(n));
    }
}
