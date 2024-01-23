package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Customer firstCustomer = new Customer("Bob");
        Customer secondCustomer = new Customer("Frank");
        Bank bigBank = new Bank("Big Bank");

        bigBank.addCustomer(firstCustomer);
        bigBank.addCustomer(secondCustomer);

        firstCustomer.performTransaction(-232.230d);
        firstCustomer.performTransaction(24.20d);
        System.out.println(bigBank);
    }
}