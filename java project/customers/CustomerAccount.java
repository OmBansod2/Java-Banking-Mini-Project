package customers;

import accounts.BankAccount;
import transactions.Deposit;
import transactions.Withdrawal;

import java.util.ArrayList;
import java.util.List;

public class CustomerAccount {
  private BankAccount account;
  private List<Deposit> deposits;
  private List<Withdrawal> withdrawals;

  public CustomerAccount(BankAccount account) {
    this.account = account;
    this.deposits = new ArrayList<>();
    this.withdrawals = new ArrayList<>();
  }

  public void deposit(double amount, LocalDateTime date) {
    account.deposit(amount);
    deposits.add(new Deposit(amount, date));
}

public void withdraw(double amount, LocalDateTime date) {
    account.withdraw(amount);
    withdrawals.add(new Withdrawal(amount, date));
}

}
