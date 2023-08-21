public class MealOrder {
    private double price;
    private Hamburger hamburger;
    private Drink drink;
    private SideItem sideItem;
    private int toppingLimit;

    public MealOrder() { // The most common meal order should be created without any arguments, like a regular burger, a small coke, and fries, for example.
        this(
                new Hamburger("Cheeseburger", 2.5),
                new Drink("small", "Coke"),
                new SideItem("Fries", 2.45d)
        );
        System.out.println("Created a meal order that contains standard elements");
        System.out.println(this);
    }

    public MealOrder(Hamburger hamburger, Drink drink, SideItem sideItem) {
        this.hamburger = hamburger;
        this.drink = drink;
        this.sideItem = sideItem; // His meal orders are composed of three items, the hamburger, the drink, and the side item. | This should be composed of exactly one burger, one drink, and one side item.

        this.price += hamburger.getBasePrice() + drink.getPrice() + sideItem.getPrice();
    }

    @Override
    public String toString() {

        return String.format(
                "%nListing all Meal Order contents: %n%s %n%s %n%s %n%s",
                this.hamburger,
                this.drink,
                this.sideItem,
                this.getTotal());
    }

    public String getTotal() {
        return String.format("%-13s|%-25s|%-15s|%-15s",
                "[MEAL ORDER]",
                " - ",
                " - ",
                " total = $" + this.getPrice());
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
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

    public double getPrice() {
        this.setPrice(this.hamburger.getBasePrice() + this.drink.getPrice() + this.sideItem.getPrice()); // recalculate price each time it is called
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}