package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customersList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customersList = new ArrayList<>();
    }

    public void addCustomer(Customer customerToAdd) {
        boolean isCustomerFound = false;

        for (Customer existingCustomer : customersList) {
            if (existingCustomer.getCustomerName().equalsIgnoreCase(customerToAdd.getCustomerName())) {
                isCustomerFound = true;
                break;
            }
        }

        if(isCustomerFound) {
            System.out.printf("Customer %s is already in the list of customers for bank %s, NOT adding the customer... \n", customerToAdd.getCustomerName(), this.bankName);
        } else {
            System.out.printf("Customer %s is not the list of customers for bank %s, adding the customer... \n", customerToAdd.getCustomerName(), this.bankName);
            this.customersList.add(customerToAdd);
        }
    }

    @Override
    public String toString() {
        return String.format("Bank \"%s\" \n Customer list: %s", this.bankName, this.customersList);
    }
}
