import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAccount {
    private double balance;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public BankAccount() {
        this.balance = 0.0;
    }

    public void setBalance(double cash) {
        this.balance += cash;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();
        DepositAccount depAcc = new DepositAccount();
        SavingsAccount savAcc = new SavingsAccount();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        double cash;

        while(true) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("XYZ ATM");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Balance Inquiry");
            System.out.println("4 - Exit");

            System.out.println();
            choice = sc.nextInt();
            System.out.println();

            switch(choice) {
                case 1:
                    try {
                        System.out.print("Enter amount to deposit: Php ");
                        cash = sc.nextDouble();

                        while(cash < 500.0) {
                            System.out.println("Please deposit an amount greater than Php 500.00.");
                            System.out.print("Enter amount to deposit: Php ");
                            cash = sc.nextDouble();
                        }

                        depAcc.setBalance(cash);
                        bankAcc.setBalance(depAcc.getBalance());
                        System.out.println("Php " + df.format(depAcc.getBalance()) + " successfully deposited");
                        System.out.println();
                    } catch(Exception e) {
                        System.err.println("Error: Input type mismatch.");
                    }
                    break;
                case 2:
                    try {
                        if(bankAcc.getBalance() <= 0) {
                            System.out.println("Zero funds.");
                            break;
                        }

                        if(bankAcc.getBalance() < 500) {
                            System.out.println("Unable to withdraw. Balance is less than Php 500.");
                        }

                        System.out.print("Enter amount to withdraw: Php ");
                        cash = sc.nextDouble();

                        while(bankAcc.getBalance() < cash) {
                            System.out.print("Insufficient Balance. Enter valid amount: Php");
                            cash = sc.nextDouble();
                        }

                        while(cash % 500 != 0) {
                            System.out.println("Please withdraw amounts in multiples of 500.");
                            System.out.print("Enter amount to withdraw: Php ");
                            cash = sc.nextDouble();
                        }

                        savAcc.setBalance(cash * -1.00);
                        bankAcc.setBalance(savAcc.getBalance());
                        System.out.println("Php " + df.format((savAcc.getBalance() * -1)) + " successfully withdrawn.");
                        System.out.println();
                    } catch(Exception e) {
                        System.err.println("Error: Input type mismatch.");
                    }
                    break;
                case 3:
                    System.out.println("Balance: Php " + df.format(bankAcc.getBalance()));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thank you for using our services.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}