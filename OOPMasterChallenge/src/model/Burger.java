package model;

import java.util.ArrayList;
import java.util.List;

public class Burger extends OrderItem{
    private List<Topping> toppings;

    public Burger(ItemProperties burgerProperties) {
        super.properties = burgerProperties;
        this.toppings = (burgerProperties.getType().equals(Type.DELUXE_BURGER)) ? new ArrayList<>(5) : new ArrayList<>(3);
    }

    @Override
    public String toString() {
        return String.format(this.format, this.getClass().getSimpleName(), this.getProperties().getType(), this.getProperties().getPrice(), this.getProperties().getSize()).concat(" Toppings: " + this.getToppings());
    }

    public void addTopping(Topping topping) {
        if (super.properties.getType().equals(Type.DELUXE_BURGER) && toppings.size() < 5) {
            this.toppings.add(topping);
            super.getProperties().setPrice(super.getProperties().getPrice() + topping.getPrice());
        } else if (toppings.size() < 3) {
            this.toppings.add(topping);
            super.getProperties().setPrice(super.getProperties().getPrice() + topping.getPrice());
        } else {
            System.out.println("Reached maximum allowed toppings");
        }
    }

    public List<Topping> getToppings() {
        return this.toppings;
    }
}
