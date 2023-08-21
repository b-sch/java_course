public class Drink {
    private String size;
    private String type;
    private double price;

    public Drink(String size, String type) {
        this.size = size;
        this.type = type;
        this.setPrice();
    }

    public void changeSize(String size) {
        switch (size.toLowerCase()) {
            case "big" -> {
                this.size = "big";
                this.setPrice();
            }
            case "medium" -> {
                this.size = "medium";
                this.setPrice();
            }
            case "small" -> {
                this.size = "small";
                this.setPrice();
            }
            default -> System.out.println("Attempting to change to non-existing size");
        }
    }

    @Override
    public String toString() {
        return String.format("%-13s|%-25s|%-15s|%-15s",
                "[DRINK]",
                " type = " + this.type,
                " size = " + this.size,
                " price = $" + this.price);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice() {
        switch (this.size) {
            case "big" -> this.price = 3.0d;
            case "medium" -> this.price = 2.0d;
            case "small" -> this.price = 1.0d;
            default -> this.price = 1.45d;
        }
    }
}