public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(){
        this("Deluxe", "Sausage & Bacon", 14.54, "White roll");
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        System.out.printf("%s hamburger on a %s with %s, price is %s%n", name, breadRollType, meat, price);
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        System.out.printf("Added %s for an extra %s%n", name, price);
        this.addition1Name = name;
        this.addition1Price = price;
        this.price += price;
    }
    public void addHamburgerAddition2(String name, double price) {
        System.out.printf("Added %s for an extra %s%n", name, price);
        this.addition2Name = name;
        this.addition2Price = price;
        this.price += price;
    }
    public void addHamburgerAddition3(String name, double price) {
        System.out.printf("Added %s for an extra %s%n", name, price);
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;
    }
    public void addHamburgerAddition4(String name, double price) {
        System.out.printf("Added %s for an extra %s%n", name, price);
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;
    }

    public double itemizeHamburger() {
        return this.price;
    }
}
