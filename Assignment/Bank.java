package Assignment;
import java.util.Scanner;

class BankAccount {
    private int accountNo;
    private String accountName;
    private String email;
    private double balance;

    // Setters
    public void setAccountNo(int accountNo) { this.accountNo = accountNo; }
    public void setAccountName(String accountName) { this.accountName = accountName; }
    public void setEmail(String email) { this.email = email; }
    public void setBalance(double balance) { this.balance = balance; }

    // Getters
    public int getAccountNo() { return accountNo; }
    public String getAccountName() { return accountName; }
    public String getEmail() { return email; }
    public double getBalance() { return balance; }
}

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[3];

        for (int i = 0; i < 3; i++) {
            accounts[i] = new BankAccount();
            System.out.println("Enter details for Account " + (i + 1));

            System.out.print("Account No: ");
            accounts[i].setAccountNo(input.nextInt());
            input.nextLine(); // consume newline

            System.out.print("Account Name: ");
            accounts[i].setAccountName(input.nextLine());

            System.out.print("Email: ");
            accounts[i].setEmail(input.nextLine());

            System.out.print("Balance: ");
            accounts[i].setBalance(input.nextDouble());
            System.out.println();
        }

        System.out.println("Acc No\tAcc Name\tEmail\t\t\tBalance");
        System.out.println("=================================================");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountNo() + "\t" + acc.getAccountName() + "\t\t" + acc.getEmail() + "\t" + acc.getBalance());
        // Close the Scanner to prevent resource leak
        input.close();
        }
    }
}

 

