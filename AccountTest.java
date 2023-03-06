package com.assigenement.stock_manegment;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Account Management System :");
        double accountBalance = 5000;
        System.out.println("Enter Amount you want to debit :");
        int debitAmount = scanner.nextInt();
        account.debit(accountBalance,debitAmount);

    }
}
