package part3;

public class MathCalculator {
    public static int sumPositiveNumbersToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
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
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int numberOfDigits = 0;
        int sum = 0;
        while (n > 0) {
            numberOfDigits++;
            n /= 10;
        }
        n = originalNumber;
        while (n > 0) {
            int number = n % 10;
            sum += (int) Math.pow(number, numberOfDigits);
            n /= 10;
        }
        return sum == originalNumber;
    }

    public static void printFibonacciNumbers(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void printDigitsReversed(int n) {
        // Use System.out.print() to print the digits without new line
        while (n > 0) {
            int digit = n % 10;
            System.out.print("\n " + digit);
            n /= 10;
        }
    }

    public static void main(String[] args) {
        printFibonacciNumbers(10);
        printDigitsReversed(12345);

        int n = 5;
        System.out.println("\nSum of positive numbers up to " + n + " is " + sumPositiveNumbersToN(n));
        System.out.println(n + " factorial is " + factorial(n));
        System.out.println(n + " is prime: " + isPrime(n));
        System.out.println(n + " is Armstrong number: " + isArmstrongNumber(n));
    }
}
