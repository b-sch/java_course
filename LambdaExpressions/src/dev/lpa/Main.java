package dev.lpa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alhpa", "bravo", "charlie", "delta"
        ));

        list.forEach(myString -> System.out.println(myString));

        // ====================================
        drawLine();
        String prefix = "NATO";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.printf("%s %-8s means %s %n", prefix, myString, first);
        });

        // ====================================
        drawLine();
        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
        var result3 = calculator((a, b) -> "%s %s".formatted(a.toUpperCase(), b.toUpperCase()), "Ralph", "Kramden");

        // ====================================
        drawLine();
        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        // ====================================
        drawLine();
        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        // ====================================
        drawLine();
        coords.forEach(s -> processPoint(s[0], s[1], p1));

        // ====================================
        drawLine();
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s -> System.out.println(s));

        // ====================================
        drawLine();
        list.addAll(List.of(
                "echo",
                "easy",
                "earnest"
        ));
        list.forEach(s -> System.out.println(s));

        // ====================================
        drawLine();
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        // ====================================
        drawLine();
        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        list.forEach(s -> System.out.println(s));

        // ====================================
        drawLine();
        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings, "");
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings, i -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, i -> "" + (i + 1) + ". "
                        + switch (i) {
                    case 0 -> "one";
                    case 1 -> "two";
                    case 2 -> "three";
                    default -> "";
                }
        );
        System.out.println(Arrays.toString(emptyStrings));

        // ====================================
        drawLine();
        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        int selectionRange = 3;
        String[] selectedValues = randomlySelectedValues(selectionRange, names, () -> new Random().nextInt(0, names.length - 1));
        System.out.println(Arrays.toString(selectedValues));
        ;
    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {

        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }

    public static void drawLine() {
        System.out.println("-".repeat(30));
    }
}