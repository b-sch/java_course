public class Main {
    public static void main(String[] args) {

        System.out.println(printDayOfTheWeek('0'));
        System.out.println(printDayOfTheWeek('1'));
        System.out.println(printDayOfTheWeek('2'));
        System.out.println(printDayOfTheWeek('3'));
        System.out.println(printDayOfTheWeek('4'));
        System.out.println(printDayOfTheWeek('5'));
        System.out.println(printDayOfTheWeek('6'));
        System.out.println(printDayOfTheWeek('7'));
        System.out.println(printDayOfTheWeek('$'));

    }

    public static String printDayOfTheWeek(char input) {

        return switch (input) {
            case '0' -> "Sunday";
            case '1' -> "Monday";
            case '2' -> "Tuesday";
            case '3' -> "Wednesday";
            case '4' -> "Thursday";
            case '5' -> "Friday";
            case '6' -> "Saturday";
            default -> {
                yield "Input was out of valid range";
            }
        };
    }
}