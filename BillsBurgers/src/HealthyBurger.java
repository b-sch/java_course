public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        System.out.printf("Added %s for an extra %s%n", name, price);
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price) {
        System.out.printf("Added %s for an extra %s%n", name, price);
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
    }
}
