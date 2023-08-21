public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(10 * 3600));
        System.out.println(getDurationString(-123));
        System.out.println(getDurationString(10 * 60, 20));
        System.out.println(getDurationString(10 * 60, -213));


    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid value";
        }

        int hours = minutes / 60;

        return String.format("%sh %sm %ss", hours, minutes % 60, seconds);
    }
}