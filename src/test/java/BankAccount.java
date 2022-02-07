import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;
    private int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public void setBalance(BigDecimal balance){
        this.balance=balance;
    }
    public void credit ( BigDecimal amount){
        balance= balance.add(amount);
    }
    public void debit (BigDecimal amount){
        if ( balance.compareTo(amount) == -1) {
          System.out.println("The amount of withdrawal is more than the balance on the account!");
        }
        else {
            balance = balance.subtract(amount);
        }
    }
}
