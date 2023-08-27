package model;

public class Drink extends OrderItem {

    private int iceCubes;

    public Drink(ItemProperties drinkProperties) {
        super(drinkProperties);
    }

    @Override
    public String toString() {
        return String.format(super.format, this.getClass().getSimpleName(), this.getProperties().getType(), this.getProperties().getPrice(), this.getProperties().getSize())
                .concat(" Has ice? " + ((this.getIceCubes() > 0) ? " YES ": " NO "));
    }

    public int getIceCubes() {
        return iceCubes;
    }

    public void addIceCubes(int iceCubes) {
        this.iceCubes = iceCubes;
        super.getProperties().setPrice(super.getProperties().getPrice() + 1.00d);
    }
}
