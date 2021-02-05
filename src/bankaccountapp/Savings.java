package bankaccountapp;

public class Savings extends Account {
    // List properties associated with savings accounts
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    // Constructor to intialize settings for savings properties
    public Savings(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        this.accountNumber = 1 + this.accountNumber;
        this.accountType = "SAVINGS";
        setSafetyDepositBox();
    }

    @Override
    protected void setRate() {
        this.rate = getBaseRate() - 0.25;
    }

    // List methods associated with savings accounts
    public void showInfo() {
        super.showInfo();
        // Savings account custom logic
        System.out.println("Savings Account Features" + "\n\tSafety Despoit Box ID: " + safetyDepositBoxId
                + "\n\tSafety Despoit Box Key: " + safetyDepositBoxKey);
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
}
