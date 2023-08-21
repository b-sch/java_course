public class Hamburger {
    private String type;
    private double basePrice;
    private int extraToppingCounter;
    private boolean isDeluxeBurger;

    public Hamburger() {
        this("Defaultburger", 2.50d);
    }

    public Hamburger(String type, double basePrice) {
        this.type = type;
        this.isDeluxeBurger = this.type.equals("Deluxe Burger"); // Create a deluxe burger meal, with a deluxe burger, that has a set price, so that any additional toppings do not change the price.
        if (isDeluxeBurger) {
            this.basePrice = 10.0d;
        } else {
            this.basePrice = Math.max(2.5d, basePrice);
        }
        this.extraToppingCounter = 0;
    }

    public void addTopping(Topping topping) {
        if (isDeluxeBurger) {
            if (this.getExtraToppingCounter() >= 5) { // The deluxe burger should have room for an additional two toppings.
                System.out.println("\nCan't add more toppings to " + this);
            } else {
                this.setExtraToppingCounter();
                System.out.printf("%nAdding extra topping %s to burger %s ", topping, this);
            }
        } else {
            if (this.getExtraToppingCounter() >= 3) {
                System.out.println("\nCan't add more toppings to " + this);
            } else {
                this.setExtraToppingCounter();
                this.setBasePrice(this.getBasePrice() + topping.getPrice());
                System.out.printf("%nAdding extra topping %s to burger %s ", topping, this);
            }
        }
    }

    @Override
    public String toString() {

        return String.format("%-13s|%-25s|%-15s|%-15s",
                "[HAMBURGER]",
                " type = " + this.type,
                " toppings = " + this.extraToppingCounter,
                " price = $" + this.basePrice);
    }

    public int getExtraToppingCounter() {
        return this.extraToppingCounter;
    }

    public void setExtraToppingCounter() {
        this.extraToppingCounter++;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
