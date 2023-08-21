public class Main {

    public static void main(String[] args) {

        getGreatestCommonDivisor(22,23);
        getGreatestCommonDivisor(123,42);

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int greatestCommonDivisor = 1;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if ((Math.min(first, second) % i == 0) && (Math.max(first, second) % i == 0)) {
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }
}
