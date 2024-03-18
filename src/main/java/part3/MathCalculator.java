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
        for (int i = 1; i <= n; i++) {
            valueOfFactorial *= i;
        }
        return valueOfFactorial;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isArmstrongNumber(int n) {
        int degree = 0;
        int iteratedNumberSum = 0;
        int num = n;
        int digit;
        while (num > 0) {
            degree++;
            num /= 10;
        }
        num = n;

        while (num > 0) {
            digit = num % 10;
            iteratedNumberSum = (int) (iteratedNumberSum + Math.pow(digit, degree));
            num = num / 10;
        }
        return iteratedNumberSum == n;
    }

    public static void printFibonacciNumbers(int n) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        if (n == 1) {
            return;
        }
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            int c;
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        System.out.println();

    }

    public static void printDigitsReversed(int n) {
        // Use System.out.print() to print the digits without new line
        int num = n;
        int digit;

        while (num > 0) {
            digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
        System.out.println();
        System.out.println();
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
