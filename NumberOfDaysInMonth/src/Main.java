public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        System.out.println("1600 - is leap year? " + isLeapYear(1600));
//        System.out.println("2000 - is leap year? " + isLeapYear(2000));
//        System.out.println("2400 - is leap year? " + isLeapYear(2400));
//
//        System.out.println("1700 - is leap year? " + isLeapYear(1700));
//        System.out.println("1800 - is leap year? " + isLeapYear(1800));
//        System.out.println("1900 - is leap year? " + isLeapYear(1900));
//        System.out.println("2100 - is leap year? " + isLeapYear(2100));
//        System.out.println("2200 - is leap year? " + isLeapYear(2200));
//        System.out.println("2300 - is leap year? " + isLeapYear(2300));
//        System.out.println("2500 - is leap year? " + isLeapYear(2500));
//        System.out.println("2600 - is leap year? " + isLeapYear(2600));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        }

        if ((year < 1) || (year > 9999)) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }
}