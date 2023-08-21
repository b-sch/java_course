public class Main {

    public static void main(String[] args) {

        sumFirstAndLastDigit(5);

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int initialNumber = number;
        int lastDigit = number % 10;
        int firstDigit = 0;

        while(number > 0) {
//            System.out.printf("\nLast digit of %s is %s", number, firstDigit = number % 10);
            if (number < 10) {
                firstDigit = number;
//                System.out.printf("\nFirst digit of %s is %s", initialNumber, number);
            }
            number /= 10;
        }

        return firstDigit + lastDigit;
    }
}
