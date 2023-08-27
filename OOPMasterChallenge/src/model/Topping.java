package model;

public class Topping {
    private double price;
    private String name;

    public Topping(double price, String name) {
        this.price = (price < 0) ? 0 : price;
        this.name = (name == null) ? "unknown" : name;
    }

    @Override
    public String toString() {
        return String.format(" %s $%s ", this.name, this.price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price < 0) ? 0 : price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null) ? "unknown" : name;
    }
}
