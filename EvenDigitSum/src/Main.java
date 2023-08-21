public class Main {

    public static void main(String[] args) {

        getEvenDigitSum(22);

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenDigitSum = 0;

        while(number > 0) {
            if ((number % 10) % 2 == 0) {
                evenDigitSum += number % 10;
            }
            number /= 10;
        }

        return evenDigitSum;
    }
}
