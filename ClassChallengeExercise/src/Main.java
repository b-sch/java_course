public class Main {
    public static void main(String[] args) {

        Account test = new Account();

        Account bobsAccount = new Account("12345", 500.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("Account No: " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());

        new Account();
    }
}