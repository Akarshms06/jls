interface Account {
 double getBalance();
 void deposit(double amount);
 void withdraw(double amount);
}
class HDFCAccount implements Account {
 private double deposits = 0.0;
 private double withdrawals = 0.0;
 @Override
 public double getBalance() {
 return deposits - withdrawals;
 }
 @Override
 public void deposit(double amount) {
 deposits += amount;
 }
 @Override
 public void withdraw(double amount) {
 if (amount <= getBalance()) {
 withdrawals += amount;
 } else {
 System.out.println("Insufficient balance");
}
}
}
class StateBankAccount implements Account {
 private double balance = 0.0;
 @Override
 public double getBalance() {
 return balance;
 }
 @Override
 public void deposit(double amount) {
 balance += amount;
 }
 @Override
 public void withdraw(double amount) {
 if (amount <= balance) {
 balance -= amount;
 } else {
 System.out.println("Insufficient balance");
 }
 }
}
public class Main {
 public static void main(String[] args) {
 Account hdfc = new HDFCAccount();
 Account sbi = new StateBankAccount();
 hdfc.deposit(1000);
 hdfc.withdraw(200);
 sbi.deposit(2000);
 sbi.withdraw(500);
 printBalance(hdfc);
printBalance(sbi);
 }
 public static void printBalance(Account account) {
 System.out.println("Balance: " + account.getBalance());
 }
}