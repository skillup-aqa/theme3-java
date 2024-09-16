package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double calculateSalaryBeforeTaxes = hourlyRate * hoursPerMonth;
        return calculateSalaryBeforeTaxes;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
    double  calculateSalaryAfterTaxes = ((hourlyRate * hoursPerMonth)-((hourlyRate * hoursPerMonth)*0.05))-1562;
        return calculateSalaryAfterTaxes;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 400));
        System.out.println(calculateSalaryAfterTaxes(160, 400));
    }
}
