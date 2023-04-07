public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Mike", 10000.0d, "mike@email.com");
        customer1.displayInstanceData("customer1");

        System.out.println("\n");

        Customer customer2 = new Customer("Dżej Dżej", "dzejdzej@jbzd.com");
        customer2.displayInstanceData("customer2");

        System.out.println("\n");

        Customer customer3 = new Customer();
        customer3.displayInstanceData("customer3");
    }
}