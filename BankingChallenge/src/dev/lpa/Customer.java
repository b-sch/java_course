package dev.lpa;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
        System.out.printf("[%tT] => transaction [%.2f] added. \n", java.util.Calendar.getInstance(), transaction);
    }
}
