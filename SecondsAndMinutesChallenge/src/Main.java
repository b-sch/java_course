public class Main {

    public static void main(String[] args) {

//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1 -> System.out.println("");
//            case 2 -> System.out.println("");
//            case 3, 4, 5 -> {
//                System.out.println("");
//                System.out.println("");
//            }
//            default -> System.out.println("");
//        }
//

        String month = "APRIL";

        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return "bad";
    }
}