package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    private String name;
    private String sSN;
    double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected String accountType;
    protected double rate;

    // Constructor set base properties and initialize the account
    public Account(String name, String sSN, double initialDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initialDeposit;

        this.accountNumber = setAccountNumber();
        index++;

        setRate();
    }

    protected abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueId + randomNumber;
    }

    public void compound() {
        double accuredIntrest = this.balance * (this.rate / 100);
        this.deposit(accuredIntrest);
    }

    // List common methods
    public void showInfo() {
        System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance
                + "\nACCOUNT TYPE: " + accountType + "\nINTREST RATE: " + rate);
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void transfer(double amount, Account toAccount) {
        this.withdraw(amount);
        toAccount.deposit(amount);
    }

    public void printBalance() {
        System.out.println("BALANCE: " + balance);
    }
}
