package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Mike", "Stan", "Cartman"};
        List<UnaryOperator<String>> listOfTransforms = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s.concat(getRandomCharacter()),
                s -> s.concat(getReversedName(s)),
                String::toLowerCase
        ));

        List<String> namesList = new ArrayList<>(List.of("Anna", "Bob", "Mike", "Stan", "Cartman"));

        processNames(namesList, listOfTransforms);
//        namesList.replaceAll(String::toUpperCase);
//        namesList.replaceAll(s -> s.concat(getRandomCharacter()));
//        namesList.replaceAll(s -> s.concat(getReversedName(s)));

    }

    public static String replaceWithDifferentChars(String s) {
        char[] characters = s.toCharArray();
        for (char chr : characters) {
            chr = 'k';
        }
        return s;
    }

    public static String getReversedName(String s) {
        return " " + new StringBuilder(s.substring(0, s.length() - 3)).reverse();
    }

    public static String getRandomCharacter() {
        return " %S.".formatted(Character.toString(new Random().nextInt(65, 90)));
    }

    public static void processNames(List<String> namesList, List<UnaryOperator<String>> transforms) {
//        namesList.replaceAll(s -> {
//            for (var transform : transforms) {
//                s = transform.apply(s);
//            }
//            return s;
//        });

        for (var transform : transforms) {
            namesList.replaceAll(s -> s.transform(transform));
            System.out.println(namesList);
        }
    }
}