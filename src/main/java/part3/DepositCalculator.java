package part3;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        double a = principal;

        for (int i = 1; i <= years; i++) {
            a = a * (1 + rate);
            System.out.println(i + " year Deposit is: " + a);
            }
    }

    public static void main(String[] args) {
        printFutureValue(1000, 0.05, 10);
    }
}
