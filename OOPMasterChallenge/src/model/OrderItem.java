package model;

public class OrderItem {
    public final String format = "%-10s| type: %-15s| price: $%.2f | size: %-8s |";
    public ItemProperties properties;

    public OrderItem(){
    }
    public OrderItem(ItemProperties properties) {
        this.properties = properties;
    }

    public ItemProperties getProperties() {
        return properties;
    }
    public void setProperties(ItemProperties properties) {
        this.properties = properties;
    }

}
