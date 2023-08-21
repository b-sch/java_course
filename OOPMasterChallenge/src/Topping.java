public class Topping {
    private String type;
    private double price;

    public Topping(String type) {

        switch (type) {
            case "Lettuce" -> {
                this.price = 1.5d;
                this.type = type;
            }
            case "Tomato" -> {
                this.price = 2.0d;
                this.type = type;
            }
            case "Cheese" -> {
                this.price = 4.0d;
                this.type = type;
            }
            default -> {
                this.price = 3.0d;
                this.type = "Custom Topping";
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%-10s|%-16s|%-15s",
                "[TOPPING]",
                " type = " + this.type,
                " price = $" + this.price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
