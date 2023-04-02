public class Main {

    public static void main(String[] args) {

        int number = 5;

        System.out.println(sumFirstAndLastDigit(number));

    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0) {
            return -1;
        }

        int initialNumberValue = number;
        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number > 9) {
            number /= 10;
        }

        firstDigit = number;

        System.out.println("First digit from " + initialNumberValue + " is " + firstDigit);
        System.out.println("Last digit from " + initialNumberValue + " is " + lastDigit);
        System.out.println("Sum of first and last digit from " + initialNumberValue + " is " + (lastDigit + firstDigit));

        return lastDigit + firstDigit;
    }
}