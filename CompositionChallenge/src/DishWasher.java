public class DishWasher {

    private boolean hasWorkToDo;

    public DishWasher() {
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing the dishes...");
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
