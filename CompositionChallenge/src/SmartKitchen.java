public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator refrigerator) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public CoffeeMaker getCoffeeMaker() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void addWater() {
        this.brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        this.refrigerator.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        this.dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeMakerState, boolean dishWasherState, boolean refrigeratorState) {
        this.brewMaster.setHasWorkToDo(coffeeMakerState);
        this.dishWasher.setHasWorkToDo(dishWasherState);
        this.refrigerator.setHasWorkToDo(refrigeratorState);
    }

    public void doKitchenWork() {
        this.brewMaster.brewCoffee();
        this.dishWasher.doDishes();
        this.refrigerator.orderFood();
    }
}
