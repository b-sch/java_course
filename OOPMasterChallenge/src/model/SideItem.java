package model;

public class SideItem extends OrderItem {

    public SideItem(ItemProperties sideItemProperties) {
        super(sideItemProperties);
    }

    @Override
    public String toString() {
        return String.format(super.format, this.getClass().getSimpleName(), this.getProperties().getType(), this.getProperties().getPrice(), this.getProperties().getSize());
    }
}
