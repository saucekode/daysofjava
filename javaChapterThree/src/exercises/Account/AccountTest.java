package exercises.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account newAccount = new Account();
        newAccount.setBalance(25);
        newAccount.withdrawMoney(2);
        System.out.println("$" + newAccount.getBalance());
    }
}
