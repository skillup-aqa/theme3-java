package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double salaryBeforeTaxes = hoursPerMonth * hourlyRate;
        return salaryBeforeTaxes;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double salaryBeforeTaxes = calculateSalaryBeforeTaxes(hoursPerMonth, hourlyRate);
        double taxes = (salaryBeforeTaxes / 100 * 5) + 1562;
        double salaryAfterTaxes = Math.round(salaryBeforeTaxes - taxes);
        return salaryAfterTaxes;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
