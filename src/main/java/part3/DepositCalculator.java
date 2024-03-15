package part3;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        int i = 1;
        double a = principal * (1 + rate);
        System.out.println(i + " year Deposit is: " + a);
        while (i < years) {
            a = a * (1 + rate);
            i++;
            System.out.println(i + " year Deposit is: " + a);
        }
    }

    public static void main(String[] args) {
        printFutureValue(1000, 0.05, 10);
    }
}
