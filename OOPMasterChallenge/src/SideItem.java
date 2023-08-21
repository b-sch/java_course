public class SideItem {

    private String type;
    private double price;

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-13s|%-25s|%-15s|%-15s",
                "[SIDE ITEM]",
                " type = " + this.type,
                " - ",
                " price = $" + this.price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
