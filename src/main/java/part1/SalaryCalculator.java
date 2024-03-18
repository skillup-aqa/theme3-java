package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {


        double X = hourlyRate * hoursPerMonth;
        System.out.println("calculateSalaryBeforeTaxes" + X);
        return X;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {


        double X =  (hourlyRate * hoursPerMonth);
        double Y =  (X - ((X*5) / 100))- 1562;
        System.out.println("calculateSalaryAfterTaxes" + Y);
        return Y;

    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
