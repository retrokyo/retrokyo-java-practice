package bankaccountapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {
        // Read csv file and create new accounts based on the data
        String file = "/home/retrokyo/code/java-practice/supportFiles/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        Map<String,Account> accounts = new HashMap<>();
        Account newAcc;

        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initialDeposit = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")) {
                newAcc = new Savings(name, sSN, initialDeposit);
                accounts.put(newAcc.accountNumber, newAcc);

            } else if (accountType.equals("Checking")) {
                newAcc = new Checking(name, sSN, initialDeposit);
                accounts.put(newAcc.accountNumber, newAcc);

            } else {
                System.out.println("Error reading account type");
            }
        }

        /*
        for (Map.Entry<String, Account> account : accounts.entrySet()) {
            account.getValue().showInfo();
        }
        */
        System.out.println(accounts.keySet().size());
    }
}
