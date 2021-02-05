package bankaccountapp;

public class Checking extends Account {
    // List properties associated with checking accounts
    int debitCardNumber;
    int debitCardPin;

    // Constructor to intialize checking account properties
    public Checking(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        this.accountNumber = 2 + this.accountNumber;
    }

    // List any methods associated with checking account
    public void showInfo() {
        super.showInfo();
        // Custom checking account logic
    }
}
