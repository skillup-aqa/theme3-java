package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double result= hoursPerMonth*hourlyRate;
        return Math.round(result);
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        // hoursPerMonth*hourlyRate *0.05%-1562( extra )
        double beforeTax = calculateSalaryBeforeTaxes(hoursPerMonth,hourlyRate);
        double result= beforeTax - ( beforeTax * 0.05 + 1562.0);
        return Math.round(result);
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
