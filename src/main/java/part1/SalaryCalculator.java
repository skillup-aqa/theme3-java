package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double calculateSalaryBeforeTaxes = hoursPerMonth * hourlyRate;
        return calculateSalaryBeforeTaxes;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
       double calculateSalaryAfterTaxes =Math.round ((hoursPerMonth* hourlyRate*0.5)/100)-1562;
        return calculateSalaryAfterTaxes;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
