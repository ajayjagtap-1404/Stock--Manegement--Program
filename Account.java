package com.assigenement.stock_manegment;

public class Account {

        public void debit(double accountBalance, int debitAmount) {
            if (accountBalance > debitAmount) {
                accountBalance -= debitAmount;
                System.out.println("Transaction Successful ....");
                System.out.println("Account Balance is :" +accountBalance);
            } else {
                System.out.println("Debit amount exceeded account balance  :");
                System.out.println("Account Balance is :" +accountBalance);

            }

        }
}
