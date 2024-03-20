package part3;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        for (int year = 1; year <= years; year++) {
            double futureValue = principal * Math.pow(1 + rate, year);
            System.out.println("Sum at the end of year" + year + ":" + futureValue);
        }

    }

    public static void main(String[] args) {
        printFutureValue(1000, 0.05, 10);
    }
}
