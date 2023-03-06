package com.assigenement.stock_manegment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
    Scanner scanner = new Scanner(System.in);
    List<Stocks> stocksArrayList = new ArrayList<>();


    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        System.out.println("Welcome to stock management program :");
        boolean repeat = true;
        while (repeat) {
            System.out.println("Enter number which operation you want to perform :");
            System.out.println(" 1. Add Stocks\n 2. Calculate total Value of Share\n 3. exit ");
            int choice = stockPortfolio.scanner.nextInt();
            final int add = 1, calculateTotalValueOfShare = 2, exit = 3;
            switch (choice) {
                case add:
                    stockPortfolio.addStocks();
                    break;
                case calculateTotalValueOfShare:
                    stockPortfolio.calculateTotalValueOfStocks();
                    break;
                case exit:
                    repeat = false;
                    break;
                default:
                    System.out.println(" invalid input Try again ...");
                    break;
            }

            stockPortfolio.printReport();
        }
    }

    public void addStocks() {
        Stocks stocks = new Stocks();
        System.out.println("Enter  Share name :");
        stocks.setShareNames(scanner.next());
        System.out.println("Enter Number of Share :");
        stocks.setNumberOfShare(scanner.nextInt());
        System.out.println("Enter Share Price :");
        stocks.setSharePrice(scanner.nextInt());
        stocksArrayList.add(stocks);

    }

    public void calculateTotalValueOfStocks() {

        double valueOfStock = 0, totalValueOfStock = 0;
        for (Stocks stocks : stocksArrayList) {

            valueOfStock = stocks.getSharePrice() * stocks.getNumberOfShare();
            System.out.println("value of stock for " + stocks.getShareNames() + " is " + valueOfStock);
            totalValueOfStock += valueOfStock;
        }
        System.out.println("Total Value of Stock : " + totalValueOfStock);
    }


    public void printReport() {
        for (Stocks info : stocksArrayList) {
            System.out.println("Share Name : " + info.getShareNames());
            System.out.println("Number of Share : " + info.getNumberOfShare());
            System.out.println("Share Price : " + info.getSharePrice());
        }
    }

}