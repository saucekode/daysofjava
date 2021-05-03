

public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double calculateMonthlyInterestRate(double savingsBalance) {
        double annualBalance = (savingsBalance * getAnnualInterestRate())/12;
        return Double.parseDouble(String.format("%.2f", annualBalance));
    }
}
