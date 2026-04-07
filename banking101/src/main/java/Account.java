import java.util.*;

public class Account {
    public enum AccountType{
        Checking,
        Savings
    }

    private long accountNumber;
    private AccountType accountType;
    private String accountHolderName;
    private double balance;

    public Account(long accountNumber, AccountType accountType, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
//hellopoopbutt