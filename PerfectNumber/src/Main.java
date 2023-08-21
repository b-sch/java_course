public class Main {

    public static void main(String[] args) {

        isPerfectNumber(10);

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sumOfDivisors += i;
//                System.out.println(number + " is evenly divided by " + i);
            }

        }

//        System.out.println("Sum of all divisors of " + number + " is = " + sumOfDivisors);

        return sumOfDivisors == number;
    }
}
