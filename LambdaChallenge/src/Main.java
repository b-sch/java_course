import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<String> firstNames = new ArrayList<>(List.of(
                "Bob",
                "Adam",
                "Arthur",
                "Kenny",
                "Cartman"));

        firstNames.forEach((s) -> System.out.println(s));
        printSeparator();

        firstNames.replaceAll((s) -> s.toUpperCase());
        firstNames.forEach((s) -> System.out.println(s));
        printSeparator();

        firstNames.replaceAll((s) -> s.concat(getRandomCharacter()));
        firstNames.forEach((s) -> System.out.println(s));
        printSeparator();

        firstNames.replaceAll((s) -> s.concat(getReversedName(s)));
        firstNames.forEach((s) -> System.out.println(s));
        printSeparator();

        List<String> purifiedList = new ArrayList<>();
        seedListWithPurifiedData(firstNames, purifiedList);
        System.out.println("purified list: ");
        purifiedList.forEach((s) -> System.out.println(s));
        System.out.println("unpurified list: ");
        firstNames.forEach((s) -> System.out.println(s));

    }

    public static String getRandomCharacter() {
        return " %S.".formatted(Character.toString(new Random().nextInt(65, 90)));
    }

    public static String getReversedName(String s) {
        return " " + new StringBuilder(s.substring(0, s.length() - 3)).reverse();
    }

    public static void printSeparator() {
        System.out.println("=".repeat(20));
    }

    public static void seedListWithPurifiedData(List<String> sourceList, List<String> targetList) {
        List<String> initialState = sourceList.stream().toList();

        // purify source list
        sourceList.removeIf((s) -> checkIfEqual(sourceList.get(sourceList.indexOf(s)).split(" ")));
        targetList.addAll(sourceList);

        // revert the changes
        sourceList.removeAll(sourceList);
        sourceList.addAll(initialState);
    }

    public static boolean checkIfEqual(String[] arrayToCheck) {
        return arrayToCheck[0].equals(arrayToCheck[arrayToCheck.length - 1]);
    }
}