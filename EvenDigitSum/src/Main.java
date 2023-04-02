public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of all even digits in -22 = " + getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number;
        int sumOfEvenDigits = 0;

        while(number > 0){
            lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sumOfEvenDigits += lastDigit;
            }
            number /= 10;
        }

        return sumOfEvenDigits;
    }
}