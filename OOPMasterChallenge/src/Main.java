public class Main {
    public static void main(String[] args) {


        MealOrder mealOrder = new MealOrder(
                new Hamburger("Chickenburger", 3.0d),
                new Drink("big","Coke"),
                new SideItem("Fries", 2.50d)
        );

        System.out.println(mealOrder.getTotal());

//        System.out.println(mealOrder);

        mealOrder.getHamburger().addTopping(new Topping("Lettuce"));
        mealOrder.getHamburger().addTopping(new Topping("Tomato"));
        mealOrder.getHamburger().addTopping(new Topping("Cheese"));
        mealOrder.getHamburger().addTopping(new Topping("Lettuce"));
        mealOrder.getDrink().changeSize("medium");

        System.out.println(mealOrder.getTotal());

//        System.out.println(mealOrder);

//        MealOrder standardMealOrder = new MealOrder();
//
//        MealOrder mealOrder2 = new MealOrder(
//                new Hamburger("Deluxe Burger", 3.0d),
//                new Drink("big","Coke", 2.50d),
//                new SideItem("Fries", 2.50d)
//        );
//
//        System.out.println(mealOrder2);
//
//        mealOrder2.getHamburger().addTopping(new Topping("Lettuce"));
//        mealOrder2.getHamburger().addTopping(new Topping("Tomato"));
//        mealOrder2.getHamburger().addTopping(new Topping("Cheese"));
//        mealOrder2.getHamburger().addTopping(new Topping("Lettuce"));
//        mealOrder2.getHamburger().addTopping(new Topping("Tomato"));
//        mealOrder2.getHamburger().addTopping(new Topping("Tomato"));

//        System.out.println("Welcome to Meal Order application! Type in \"q\" to quit");

//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            String userInput = scanner.nextLine();
//            if (userInput.toUpperCase().contains("Q")) {
//                System.out.println("Exiting...");
//                break;
//            }
//        }

    }
}