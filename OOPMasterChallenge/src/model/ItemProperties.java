package model;

public class ItemProperties {
    private double price;
    private Size size;
    private Type type;

    public ItemProperties(double price) {
        this(price, Type.DEFAULT, Size.DEFAULT);
    }

    public ItemProperties(double price, Size size) {
        this(price, Type.DEFAULT, size);
    }

    public ItemProperties(double price, Type type) {
        this(price, type, Size.DEFAULT);
    }

    public ItemProperties(double price, Type type, Size size) {
        this.price = (price < 0) ? 0 : price;
        this.type = type;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
