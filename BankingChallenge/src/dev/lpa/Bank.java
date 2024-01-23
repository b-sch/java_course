package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
//        System.out.printf("[%tT] => attempting to add the branch [%S] ... \n", java.util.Calendar.getInstance(), branchName);
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
//            System.out.printf("[%tT] => Adding the branch [%S] ... \n", java.util.Calendar.getInstance(), branchName);
            return true;
        } else {
//            System.out.printf("[%tT] => NOT adding the branch [%S]. \n", java.util.Calendar.getInstance(), branchName);
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
//        System.out.printf("[%tT] => attempting to add the customer [%S] to branch [%S] ... \n", java.util.Calendar.getInstance(), customerName, branchName);
        Branch existingBranch = this.findBranch(branchName);
        Branch test = new Branch("test");

        if (existingBranch != null) {
            return existingBranch.newCustomer(customerName, initialTransaction);
        } else {
//            System.out.printf("[%tT] => cannot add the customer [%S] to non-existing branch [%S]. \n", java.util.Calendar.getInstance(), customerName, branchName);
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        System.out.printf("[%tT] => attempting to add transaction [%.2f] to the customer [%S] to branch [%S] ... \n", java.util.Calendar.getInstance(), transaction, customerName, branchName);
        Branch existingBranch = findBranch(branchName);

        if (existingBranch == null) {
            System.out.printf("[%tT] => transaction [%.2f] NOT added. \n", java.util.Calendar.getInstance(), transaction);
            return false;
        }

        return existingBranch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String branchName) {
//        System.out.printf("[%tT] => searching for branch [%S] in bank [%S] ... \n", java.util.Calendar.getInstance(), branchName, this.name);
        for (Branch existingBranch : this.branches) {
            if (existingBranch.getName().equalsIgnoreCase(branchName)) {
//                System.out.printf("[%tT] => branch [%S] was found. \n", java.util.Calendar.getInstance(), branchName, this.name);
                return existingBranch;
            }
        }
//        System.out.printf("[%tT] => branch [%S] was NOT found in bank [%S]. \n", java.util.Calendar.getInstance(), branchName, this.name);
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        System.out.println("Customer details for branch " + branchName);
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        if (printTransactions) {
            ArrayList<Customer> customersFromExistingBranch = branch.getCustomers();
            for (Customer customer : customersFromExistingBranch) {
                ArrayList<Double> customerTransactions = customer.getTransactions();
                System.out.printf("Customer: %s[%s]\n", customer.getName(), customersFromExistingBranch.indexOf(customer) + 1);
                System.out.println("Transactions");
                for (Double transaction : customerTransactions) {
                    System.out.printf("[%s] Amount %.2f\n", customerTransactions.indexOf(transaction) + 1, transaction);
                }
            }
        } else {
            ArrayList<Customer> customersFromExistingBranch = branch.getCustomers();
            for (Customer customer : customersFromExistingBranch) {
                System.out.printf("Customer: %s[%s]\n", customer.getName(), customersFromExistingBranch.indexOf(customer) + 1);
            }
        }

        return true;
    }

}
