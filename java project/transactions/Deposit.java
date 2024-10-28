package transactions;

import java.time.*;

public class Deposit {
  private double amount;
  private LocalDateTime date;

  public Deposit(double amount, LocalDateTime date) {
    this.amount = amount;
    this.date = date;
  }
}
