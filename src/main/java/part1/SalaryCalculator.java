package part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        double hours = 8;
        double days = 20;
        double pay = 10;
        double salary = hours*days*pay;
        return salary;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        double hours = 8;
        double days = 20;
        double pay = 10;
        double salary = hours*days*pay;
        double tax = salary*5/100;
        double tax2 = 1562;
        double salaryafter = salary-tax-tax2;
        return salaryafter;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalaryBeforeTaxes(160, 10));
        System.out.println(calculateSalaryAfterTaxes(160, 10));
    }
}
