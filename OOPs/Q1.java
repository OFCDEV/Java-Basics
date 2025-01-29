//Create a class "BankAccount" with attributes account number and balance. Implement methods to deposit and withdraw funds, and a display method to show the account details.
package OOPs;

public class Q1 {
    String accountNo;
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount){
        if (balance>= amount) {
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void display(){
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Q1 account1 = new Q1();
        account1.accountNo = "123456789";
        account1.balance = 1000;
        account1.deposit(100); // balance = 1000 + 100 = 1100
        account1.withdraw(10); // balance = 1100 - 10 = 1090

        account1.display();
    }
}
