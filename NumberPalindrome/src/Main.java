public class Main {

    public static void main(String[] args) {

        isPalindrome(1221);
        isPalindrome(123456789);
        isPalindrome(12345);

    }

    public static boolean isPalindrome(int number) {

        String reversedNumber = "";
        int initialNumber = number;

        while(number > 0) {
            reversedNumber += (number % 10);
            number /= 10;
        }

        return (initialNumber == Integer.parseInt(reversedNumber));
    }
}
