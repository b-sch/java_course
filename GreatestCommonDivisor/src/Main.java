import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int smallerNumber = Integer.min(first, second);
        int biggerNumber = Integer.max(first, second);

        int largestCommonDivisor = 0;

        for (int i = 1; i <= smallerNumber; i++) {
            if (smallerNumber % i == 0) {
                if(biggerNumber % i == 0) {
                    largestCommonDivisor = i;
                }
            }
        }

        return largestCommonDivisor;
    }
}