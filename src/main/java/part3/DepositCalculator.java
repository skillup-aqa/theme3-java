package part3;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        // TODO: Implement solution here
        for (int year = 1; year < 10; year++) {
            principal += principal * rate;
            System.out.println("Year" + year + "-" + principal);
        }
    }
    public static void main(String[] args) {
        printFutureValue(1000, 0.05, 10);
    }
}
