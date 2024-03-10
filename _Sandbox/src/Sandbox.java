import java.util.ArrayList;
import java.util.List;


public class Sandbox {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(List.of(
                new Person("Waylon","Morton"),
                new Person("Kenny","Glover"),
                new Person("Mike","Hull"),
                new Person("Bob","Harris"),
                new Person("Rick","Burton")
                ));

        personList.sort((p1, p2) -> p1.compareTo(p2));
        personList.forEach((s) -> System.out.println(s));

        Feedable action = new Feedable() {
            @Override
            public void eat() {

            }
        };

    }
}