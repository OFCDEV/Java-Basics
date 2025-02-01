//Create a class BankAccount with methods deposit(double amount) and withdraw(double amount). Throw a custom exception InsufficientFundsException if the balance is insufficient for withdrawal. Write a program that demonstrates exception propagation in the context of multiple method calls.
package OOPs;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

     double getBalance() {
        return balance;
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.deposit(500);
            System.out.println("Balance: " + account.getBalance());
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
