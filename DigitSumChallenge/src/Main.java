public class Main {

    public static void main(String[] args) {

        sumDigits(125);
        sumDigits(1000);

    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int initialNumber = number;
        int sumOfDigits = 0;

        while (number != 0) {
            System.out.printf("\nlast digit of %s is %s", number, number % 10);
            sumOfDigits += number % 10;
            System.out.printf("\n%s after / 10 is %s", number, number / 10);
            number /= 10;
        }

        System.out.printf("\nsum of all digits of %s is %s", initialNumber, sumOfDigits);
        System.out.println("\n=====\n");

//        System.out.printf("last digit of %s is %s\n", number, number % 10);
//        System.out.printf("%s after / 10 is %s", number, number / 10);

        return -1;
    }
}
