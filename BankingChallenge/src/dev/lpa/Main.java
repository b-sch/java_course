package dev.lpa;

public class Main {
    public static void main(String[] args) {

        /*
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        String customerName = "Bob";


        bank.addBranch(branchName);
        drawLine();
        bank.addBranch(branchName);
        drawLine();
        bank.addCustomer(branchName, customerName, 2.45f);
        drawLine();
        bank.addCustomer(branchName, customerName, 2.55f);
        drawLine();
        bank.addCustomer(branchName, "Mateusz", 1.00f);
        drawLine();
        bank.addCustomer(branchName, "Domino", 2.45f);
        drawLine();
        bank.addCustomer("Keratin", "Bob", 2.45f);
        drawLine();
        bank.addCustomerTransaction("doesn't exist", "", 0);
        drawLine();
        bank.addCustomerTransaction(branchName, "", 0);
        drawLine();
        bank.addCustomerTransaction(branchName, customerName, 99.00f);
        drawLine();
        bank.addCustomerTransaction(branchName, customerName, 23.00f);
        drawLine();
        bank.addCustomerTransaction(branchName, customerName, 5.72f);
        drawLine();
        bank.listCustomers(branchName, true);
        drawLine();
        bank.listCustomers(branchName, false);
         */

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Adelaide", false);

    }
    
    private static void drawLine() {
        System.out.println("=".repeat(30));
    }
}