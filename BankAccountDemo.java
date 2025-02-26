// Define the BankAccount class
class BankAccount {
    // Attributes with access modifiers
    public String accountHolder;
    private double balance;
    protected String accountType;
    
    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    // Method to get the balance
    public double getBalance() {
        return balance;
    }
}

// Main class to run the program
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount("Donna", 10000.0, "Checking");
        
        // Perform deposit and withdrawal operations
        myAccount.deposit(2550.0);
        myAccount.withdraw(1300.0);
        
        // Display account details
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
