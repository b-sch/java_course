public class Main {

    public static void main(String[] args) {

//        isPalindrome(123);

        System.out.println(isPalindrome(-1221));
//        isPalindrome(124);
//        isPalindrome(125);

    }

    public static boolean isPalindrome(int number) {
        if (number < 0){
            number = number * -1;
        }

        int reverse = 0;
        int lastDigit = 0;
        int initialNumberValue = number;


        while (number > 0) {
            lastDigit = number % 10;
//            System.out.println("Last digit of a number " + number + " is = " + lastDigit);
            reverse += lastDigit;
//            System.out.println("Reversed number has been increased by " + lastDigit + " and is = " + reverse);
            if (number < 10) {
                break;
            }
            reverse *= 10;
//            System.out.println("Reverse is now prepared to get another number and is = " + reverse);
            number /= 10;
        }

//        System.out.println("Attempting to compare " + reverse + " with " + initialNumberValue);

        return reverse == initialNumberValue;
    }
}