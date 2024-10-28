package accounts;

public class BankAccount {
  private double balance;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      throw new IllegalStateException("Insufficient funds");
    }
  }

  public double getBalance() {
    return balance;
  }
}
