package app;

import model.*;

public class Main {

    public static void main(String[] args) {

        MealOrder theMealOrder = new MealOrder(
                new Burger(new ItemProperties(2.45d, Type.CHEESEBURGER)),
                new Drink(new ItemProperties(2.0d, Type.COKE, Size.MEDIUM)),
                new SideItem( new ItemProperties(1.0d, Type.FRIES, Size.SMALL))
        );

        System.out.println(theMealOrder);
        theMealOrder.getBurger().addTopping(new Topping(2.45d, "Lettuce"));
        theMealOrder.getBurger().addTopping(new Topping(1.00d, "Tomato"));
        System.out.println(theMealOrder);
        theMealOrder.getBurger().addTopping(new Topping(0.45d, "Onion"));
        theMealOrder.getDrink().addIceCubes(5);
        theMealOrder.getDrink().getProperties().setSize(Size.BIG);
        System.out.println(theMealOrder);
    }
}
