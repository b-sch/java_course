import java.sql.SQLOutput;

public class Eagle extends Animal implements CanFly, CanEat {


    public Eagle(int legs, int eyes, String description) {
        super.legs = legs;
        super.eyes = eyes;
        super.description = description;
        super.state = State.IDLE;
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " eats.");
        super.state = State.FEEDING;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void getAnimalInfo() {
        super.getAnimalInfo();
    }
}
