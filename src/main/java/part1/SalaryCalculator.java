package part1;
public class SalaryCalculator {

    public static void main(String[] args) {
    double hoursPerMonth = 160;
    double hourlyRate = 10;
    double ESV = 1562;
    double taxRate = 0.95;
    double calculateSalaryBeforeTaxes = hoursPerMonth * hourlyRate;
    double calculateSalaryAfterTaxes = calculateSalaryBeforeTaxes * taxRate;
    double resultSalaty = Math.round(calculateSalaryAfterTaxes - ESV);
    
        System.out.println(resultSalaty);
        
    }
}

