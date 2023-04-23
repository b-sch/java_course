public class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker() {
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee...");
            hasWorkToDo = false;
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
