public class Main {
    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount(12345, 500.0, "John Smith", "john.smith@mail.com", "(+48) 515-120-206");

        BankAccount bankAccount = new BankAccount();

        System.out.println(
                "\nCreated a bank account with this data: \n" +
                        "Customer name: " + bankAccount.getCustomerName() + "\n" +
                        "Customer email: " + bankAccount.getCustomerEmail() + "\n" +
                        "Customer phone number: " + bankAccount.getCustomerPhoneNumber() + "\n" +
                        "Customer account number: " + bankAccount.getAccountNumber() + "\n" +
                        "Initial account balance is = " + bankAccount.getAccountBalance() + "\n"
        );


        bankAccount.depositFunds(100_000.0d);

        bankAccount.withdrawFunds(50_000.0d);

        bankAccount.withdrawFunds(70_000.0d);

        bankAccount.withdrawFunds(-10_000.0d);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "123456789");

        System.out.println("Account No: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());

    }
}