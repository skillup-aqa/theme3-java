package part3;


public class MathCalculator {
    public static int sumPositiveNumbersToN(int n) {
        // Consider 0 as a positive number
        // TODO: Implement solution here
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }

        return sum;
    }

    public static int factorial(int n) {
        // TODO: Implement solution here
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;

        }
        return sum;
    }

    public static boolean isPrime(int n) {
        // Consider 1 and negative numbers as non-prime
        // TODO: Implement solution here
        if (n <= 1)
            return false;

                for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;

    }

    public static boolean isArmstrongNumber(int n) {
        // TODO: Implement solution here
        int Number = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

       return sum == Number;


}

    public static void printFibonacciNumbers(int n) {
        // TODO: Implement solution here
        int f = 0;
        int s = 1;

        for (int i = 2; i < n; i++) {
            int num = f + s;

            System.out.print(num + " ");
            f = s;
            s = num;
        }
        System.out.println("FibonacciNumbers" + " ");
            }



    public static void printDigitsReversed(int n) {
        // Use System.out.print() to print the digits without new line
        // TODO: Implement solution here
        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printFibonacciNumbers(10);
        printDigitsReversed(12345);

        int n = 25;
        System.out.println("Sum of positive numbers up to " + n + " is " + sumPositiveNumbersToN(n));
        System.out.println(n + " factorial is " + factorial(n));
        System.out.println(n + " is prime: " + isPrime(n));
        System.out.println(n + " is Armstrong number: " + isArmstrongNumber(n));
    }
}
