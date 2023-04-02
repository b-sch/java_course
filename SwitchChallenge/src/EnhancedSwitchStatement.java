public class EnhancedSwitchStatement {

    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        printDayOfWeek(-1);

        System.out.println("\n ========================================== \n");
        
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
        printWeekDay(-1);
    }

    public static void printDayOfWeek(int day) {

        switch (day) {
            case 0 -> System.out.println("Weekday number entered: " + day + " \n That is Sunday");
            case 1 -> System.out.println("Weekday number entered: " + day + " \n That is Monday");
            case 2 -> System.out.println("Weekday number entered: " + day + " \n That is Tuesday");
            case 3 -> System.out.println("Weekday number entered: " + day + " \n That is Wednesday");
            case 4 -> System.out.println("Weekday number entered: " + day + " \n That is Thursday");
            case 5 -> System.out.println("Weekday number entered: " + day + " \n That is Friday");
            case 6 -> System.out.println("Weekday number entered: " + day + " \n That is Saturday");
            default -> System.out.println("Weekday number entered: " + day + " \n That is an invalid value and is outside of weekday range.");
        }
    }

    public static void printWeekDay(int day) {
        
        if (day == 0) {
            System.out.println("Weekday number entered: " + day + " \n That is Sunday");
        } else if (day == 1) {
            System.out.println("Weekday number entered: " + day + " \n That is Monday");
        } else if (day == 2) {
            System.out.println("Weekday number entered: " + day + " \n That is Tuesday");
        } else if (day == 3) {
            System.out.println("Weekday number entered: " + day + " \n That is Wednesday");
        } else if (day == 4) {
            System.out.println("Weekday number entered: " + day + " \n That is Thursday");
        } else if (day == 5) {
            System.out.println("Weekday number entered: " + day + " \n That is Friday");
        } else if (day == 6) {
            System.out.println("Weekday number entered: " + day + " \n That is Saturday");
        } else {
            System.out.println("Weekday number entered: " + day + " \n That is an invalid value and is outside of weekday range.");
        }
    }
}
