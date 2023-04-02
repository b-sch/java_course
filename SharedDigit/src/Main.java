import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println("===================");
        System.out.println(hasSharedDigit(9,99));
        System.out.println("===================");
        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)){
            return false;
        }

        int initialValueOfFirstNumber = firstNumber;
        int initialValueOfSecondNumber = secondNumber;

        while(firstNumber > 0){
            int lastDigitInFirstNumber = firstNumber % 10;

            while(secondNumber > 0) {
                int lastDigitInSecondNumber = secondNumber % 10;
                if(lastDigitInFirstNumber == lastDigitInSecondNumber){
                    return true;
                }
                System.out.println(lastDigitInSecondNumber);
                secondNumber /= 10;
            }

            secondNumber = initialValueOfSecondNumber;
            firstNumber /= 10;
        }

        return false;
    }
}

