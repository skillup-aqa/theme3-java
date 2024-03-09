package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        // TODO: Implement solution here
        return hourlyRate * hoursPerMonth;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        // TODO: Implement solution here
        return ((hourlyRate * hoursPerMonth)-((hourlyRate * hoursPerMonth)*0.05))-1562;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 400));
        System.out.println(calculateSalaryAfterTaxes(160, 400));
    }
}
