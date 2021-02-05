package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {
        // Read csv file and create new accounts based on the data
        Checking chkacc1 = new Checking("Reeves Froning", "213649587", 2000);

        Savings sacc2 = new Savings("Tyler Wilson", "854632594", 1000);

        chkacc1.showInfo();
        sacc2.showInfo();
    }
}
