public class Main {

    public static void main(String[] args) {

        int testNumber = 10;

        Integer i = 1;

        System.out.printf("Sum of digits in %1$d = %2$d", testNumber, sumDigits(testNumber));
    }

    public static int sumDigits(int number) {
        if (number <= 0) {
            return -1;
        }

        int sumOfDigits = 0;

        while (number > 9) {
            sumOfDigits += (number % 10);
            number = number / 10;
        }

        sumOfDigits += number;

        return sumOfDigits;
    }
}