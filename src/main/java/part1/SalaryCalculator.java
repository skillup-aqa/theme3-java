package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {

        return hoursPerMonth * hourlyRate;

    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double rate =  (hoursPerMonth * hourlyRate);

        double rateTax = (rate * 0.05) + 1562;

        return rate - rateTax;


    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 100));
        System.out.println(calculateSalaryAfterTaxes(160, 100));

    }
}
