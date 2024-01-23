public abstract class ProductForSale {

    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return this.price * quantity;
    }

    public void printPricedLineItem(int quantity) {
        System.out.printf("%s x $%s", quantity, this.price);
    }

    public abstract String showDetails();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
