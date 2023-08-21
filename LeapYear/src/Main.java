public class Main {
    public static void main(String[] args) {

        System.out.printf("Is year %s a leap year? %b \n", 1700, isLeapYear(1700));
        System.out.printf("Is year %s a leap year? %b \n", 1800, isLeapYear(1800));
        System.out.printf("Is year %s a leap year? %b \n", 1900, isLeapYear(1900));
        System.out.printf("Is year %s a leap year? %b \n", 2100, isLeapYear(2100));
        System.out.printf("Is year %s a leap year? %b \n", 2200, isLeapYear(2200));
        System.out.printf("Is year %s a leap year? %b \n", 2300, isLeapYear(2300));
        System.out.printf("Is year %s a leap year? %b \n", 2500, isLeapYear(2500));
        System.out.printf("Is year %s a leap year? %b \n", 2600, isLeapYear(2600));

        System.out.printf("Is year %s a leap year? %b \n", 1600, isLeapYear(1600));
        System.out.printf("Is year %s a leap year? %b \n", 2000, isLeapYear(2000));
        System.out.printf("Is year %s a leap year? %b \n", 2400, isLeapYear(2400));

        System.out.printf("Is year %s a leap year? %b \n", -1600, isLeapYear(-1600));
        System.out.printf("Is year %s a leap year? %b \n", 1600, isLeapYear(1600));
        System.out.printf("Is year %s a leap year? %b \n", 2017, isLeapYear(2017));
        System.out.printf("Is year %s a leap year? %b \n", 2000, isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }

        if ((year % 4 == 0)) { // step 1
            if ((year % 100 == 0)) { // step 2
                if ((year % 400 == 0)) { // step 3
                    return true; // step 4
                } else {
                    return false; // step 5
                }
            } else {
                return true; // step 4
            }
        } else {
            return false; // step 5
        }
    }
}