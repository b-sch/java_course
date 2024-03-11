package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        String[] names = {
                "Anna",
                "Bob",
                "Mike",
                "Kenny"
        };

        Supplier<Random> randomiser = Random::new;
        Function<Random, String> characterGenerator = (r) -> Character.toString(r.nextInt(65, 90));

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println((char) random.nextInt(65, 90));
        }

        UnaryOperator<String> addMiddleInitial = (s) -> s.concat(s);

        List<UnaryOperator<String>> listOfTransformations = new ArrayList<>(
                List.of(
                        String::toUpperCase,
                        (s) -> s.concat("s")
                )
        );
    }

}