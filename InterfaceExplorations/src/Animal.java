public abstract class Animal {

    protected int legs;
    protected int eyes;
    protected State state;
    protected String description;

    public void getAnimalInfo() {
        String className = this.getClass().getSimpleName();

        System.out.printf(
                "%s has: %10s legs | %s eyes \n%s is in: %10s state", className, legs, eyes, className, state
        );
    }
}