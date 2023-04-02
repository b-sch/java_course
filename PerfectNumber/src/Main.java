public class Main {

    public static void main(String[] args) {

        int number = -1;

        System.out.printf("Is number %1$d a perfect number? The answer is: %2$b", number, isPerfectNumber(number));

    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sumOfAllProperDivisors = 0;

        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                sumOfAllProperDivisors += i;
            }
        }

        return sumOfAllProperDivisors == number;
    }
}