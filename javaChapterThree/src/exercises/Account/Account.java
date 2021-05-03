package exercises.Account;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void withdrawMoney(double withdrawnBalance){
        if(withdrawnBalance > balance){
            withdrawnBalance = balance;
            System.out.println("Withdrawal amount exceeded account balance.");
        }
        balance -= withdrawnBalance;
    }

}
