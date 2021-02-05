package bankaccountapp;

public class Checking extends Account {
    // List properties associated with checking accounts
    int debitCardNumber;
    int debitCardPin;

    // Constructor to intialize checking account properties
    public Checking(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
    }

    // List any methods associated with checking account
}
