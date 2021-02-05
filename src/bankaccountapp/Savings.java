package bankaccountapp;

public class Savings extends Account {
    // List properties associated with savings accounts
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // Constructor to intialize settings for savings properties
    public Savings(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        this.accountNumber = 1 + this.accountNumber;
    }

    // List methods associated with savings accounts
    public void showInfo() {
        super.showInfo();
        // Savings account custom logic
    }
}
