public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Called full constructor.");
    }

    public Customer(){
        this("Default Name", "Default Email Address");
        System.out.println("Called no argument constructor.");
    }

    public Customer(String name, String email) {
        this(name, 0.0d, email);
        System.out.println("Called partial argument constructor.");
    }

    public void displayInstanceData(String instanceName){
        System.out.println("\ndata of: " + instanceName);
        System.out.println("\n" +
                "Customer name: " + this.getName() + " \n" +
                "Customer credit limit: " + this.getCreditLimit() + " \n" +
                "Customer email: " + this.getEmail()
        );
    }
}
