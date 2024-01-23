package dev.lpa;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactionsList;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactionsList = new ArrayList<>();
    }

    public void performTransaction(Double transaction) {
        this.transactionsList.add(transaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return String.format("\n Customer: %s | Transactions: %s", this.customerName, this.transactionsList);
    }
}
