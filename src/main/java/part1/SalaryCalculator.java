package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        return hoursPerMonth * hourlyRate;

    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {

        double rateTax = (hoursPerMonth * hourlyRate ) * 0.05 + 1562;
        double rate = hoursPerMonth * hourlyRate;
        return Math.round(rate - rateTax);


    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 100));
        System.out.println(calculateSalaryAfterTaxes(160, 100));

    }
}
