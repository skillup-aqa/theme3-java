package part3;

import java.awt.*;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        for (double i = 1; i <= years; i++) {
            double FutureValue = principal * Math.pow(1 + rate, i);
            System.out.println("year : " + i);
            System.out.println("FutureValue is :" + FutureValue);

        }

    }

    public static void main(String[] args) {
        printFutureValue(1000, 0.05, 10);
    }
}
