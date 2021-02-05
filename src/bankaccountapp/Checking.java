package bankaccountapp;

public class Checking extends Account {
    // List properties associated with checking accounts
    int debitCardNumber;
    int debitCardPin;

    // Constructor to intialize checking account properties
    public Checking(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        this.accountNumber = 2 + this.accountNumber;
        this.accountType = "CHECKING";
        setDebitCard();
    }

    // List any methods associated with checking account
    public void showInfo() {
        super.showInfo();
        // Custom checking account logic
        System.out.println("Checking Account Features" + "\n\tDebit Card Number: " + debitCardNumber
                + "\n\tDebit Card Pin: " + debitCardPin);
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
}
