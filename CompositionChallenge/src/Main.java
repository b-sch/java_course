public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen(new CoffeeMaker(), new DishWasher(), new Refrigerator());

        smartKitchen.setKitchenState(false,true,true);

        smartKitchen.addWater();
        smartKitchen.getCoffeeMaker().brewCoffee();

//        smartKitchen.loadDishwasher();
//        smartKitchen.getDishWasher().doDishes();

//        smartKitchen.pourMilk();
//        smartKitchen.getRefrigerator().orderFood();

        smartKitchen.doKitchenWork();
    }
}