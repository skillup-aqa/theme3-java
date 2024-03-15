package part3;

import java.util.Scanner;

public class CollatzConjectureTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("The number must be natural.");
            return;
        }
        int steps = collatzConjecture(number);
        System.out.println("Number of steps required to get 1:" + steps);
    }

    public static int collatzConjecture(int n) {

        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }

        return steps;
    }

}
