interface BalanceHolder {
    double getBalance();
    void setBalance(double balance);
}

class BankAccount implements BalanceHolder {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance += balance;
    }
}

public class Activity10 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000.0);
        System.out.println("Initial Balance: Php " + myAccount.getBalance());

        myAccount.setBalance(500.0);
        myAccount.setBalance(1500.0);

        System.out.println("Updated balance: Php " + myAccount.getBalance());
    }
}