// Custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String Mymessage) {
        super(Mymessage);
    }
}

class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method that throws a custom exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to withdraw $" + amount);
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        }
    }
}

// Main class to demonstrate exception handling
public class BankingSystem {
    public static void main(String[] args) {

        Account myAccount = new Account("123456789", 500.0);
        try {
            myAccount.withdraw(200.0);
            myAccount.withdraw(400.0); // This line will throw an exception
            System.out.println("This line will not be reached");
        } catch (InsufficientFundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
