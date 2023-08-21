public class Main {

    public static void main(String[] args) {

        sumOdd(2,10);

    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        if ((start < 0) || (end < 0) || (start > end)) {
            System.out.printf("\nprovided invalid input \n start was: %s \n end was: %s", start, end);
            return -1;
        } else {

            int sumOfOddNumbers = 0;

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    System.out.printf("%s is an odd number in range between %s and %s\n", i, start, end);
                    sumOfOddNumbers += i;
                }
            }

            System.out.println("Sum of found odd numbers is = " + sumOfOddNumbers);

            return sumOfOddNumbers;
        }

    }
}
