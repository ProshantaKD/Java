import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double monthlySalary;
        int creditScore;
        String criminalRecordStr;
        boolean criminalRecord = false;
        double desiredLoanAmount;
        double annualInterestRate;
        int loanPeriodYears;

        System.out.print("Enter your monthly salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter your credit score (0 - 500): ");
        creditScore = input.nextInt();

        System.out.print("Do you have a criminal record (true/false): ");
        criminalRecordStr = input.next();

        if (criminalRecordStr.equalsIgnoreCase("true")) {
            criminalRecord = true;
        } else {
            criminalRecord = false;
        }

        System.out.print("Enter your desired loan amount: ");
        desiredLoanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        annualInterestRate = input.nextDouble();

        System.out.print("Enter loan period in years: ");
        loanPeriodYears = input.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100.0) / 12.0;
        int totalPayments = loanPeriodYears * 12;

        double monthlyPayment;

        if (monthlyInterestRate == 0) {
            monthlyPayment = desiredLoanAmount / totalPayments;
        } else {
            double base = 1.0 + monthlyInterestRate;
            double powerFactor = 1.0;
            for (int k = 0; k < totalPayments; k++) {
                powerFactor *= base;
            }
            monthlyPayment = desiredLoanAmount * (monthlyInterestRate * powerFactor) / (powerFactor - 1.0);
        }

        System.out.println("\nMonthly Mortgage Payment: $" + monthlyPayment);

        input.close();
    }
}