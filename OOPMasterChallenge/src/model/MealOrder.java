package model;

public class MealOrder {
    private int id = 0;
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.id++;
    }

    @Override
    public String toString() {
        return String.format("The Order #%s contains: %n%s %n%s %n%s %nTOTAL = $%.2f", this.id, this.burger, this.drink, this.sideItem, this.getOrderPrice());
    }

    public double getOrderPrice() {
        return
                this.burger.getProperties().getPrice() +
                this.drink.getProperties().getPrice() +
                this.sideItem.getProperties().getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void setSideItem(SideItem sideItem) {
        this.sideItem = sideItem;
    }
}
