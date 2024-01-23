package dev.lpa;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (this.findCustomer(customerName) == null) {
            Customer customerToAdd = new Customer(customerName, initialTransaction);
            this.customers.add(customerToAdd);
            System.out.printf("[%tT] => customer [%S] added. \n", java.util.Calendar.getInstance(), customerName, this.name);
            return true;
        } else {
            System.out.printf("[%tT] => customer [%S] NOT added. \n", java.util.Calendar.getInstance(), customerName, this.name);
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer == null) {
            System.out.printf("[%tT] => transaction [%S] NOT added. \n", java.util.Calendar.getInstance(), transaction);
            return false;
        } else {
            existingCustomer.addTransaction(transaction);
            return true;
        }
    }

    private Customer findCustomer(String customerName) {
        System.out.printf("[%tT] => searching for customer [%S] in branch [%S] ... \n", java.util.Calendar.getInstance(), customerName, this.name);
        for (Customer existingCustomer : this.customers) {
            if (existingCustomer.getName().equalsIgnoreCase(customerName)) {
                System.out.printf("[%tT] => found customer [%S] in branch [%S]. \n", java.util.Calendar.getInstance(), customerName, this.name);
                return existingCustomer;
            }
        }
        System.out.printf("[%tT] => customer [%S] NOT found in branch [%S]. \n", java.util.Calendar.getInstance(), customerName, this.name);
        return null;
    }

}
