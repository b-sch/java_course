import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//        numberToWords(100);
//        for(int i = -100; i <= 100; i++){
//            System.out.printf("Reversing %1$d: %2$d \n", i , reverse(i));
//        }

//        System.out.printf("Reversing %1$d: %2$d \n", -121 , reverse(-121));
//        System.out.printf("Reversing %1$d: %2$d \n", 1212 , reverse(1212));
//        System.out.printf("Reversing %1$d: %2$d \n", 1234 , reverse(1234));
//        System.out.printf("Reversing %1$d: %2$d \n", 100 , reverse(1));

//        System.out.printf("The number %1$d has %2$d digits \n", 0 , getDigitCount(0));
//        System.out.printf("The number %1$d has %2$d digits \n", 123 , getDigitCount(123));
//        System.out.printf("The number %1$d has %2$d digits \n", -12 , getDigitCount(-12));
//        System.out.printf("The number %1$d has %2$d digits \n", 5200 , getDigitCount(5200));

        numberToWords(123);
        System.out.println("\n");
        numberToWords(1010);
        System.out.println("\n");
        numberToWords(1000);
        System.out.println("\n");
        numberToWords(-12);
        System.out.println("\n");
        numberToWords(100);

//        System.out.printf("Reversing %1$d: %2$d \n", -53 , reverse(-53));

    }

    public static void numberToWords(int number) {
        int lastDigit = 0;
        int initialNumberValue = number;
        boolean shouldQuit = false;

        if (number < 0) {
            System.out.println("Invalid Value");
            shouldQuit = true;
        }

        number = reverse(number);

        for (int i = 1; i <= String.valueOf(initialNumberValue).length(); i++) {
            if (shouldQuit) {
                break;
            }

            lastDigit = number % 10;

            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Value");
                    break;
            }

            number /= 10;
        }

    }

    public static int reverse(int number) {

        int lastDigit = 0;
        int reversedNumber = 0;
        boolean numberIsNegative = false;

        if (number < 0) {
            numberIsNegative = true;
            number *= -1;
        }

        // reverse number

        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        return numberIsNegative ? reversedNumber * -1 : reversedNumber;
    }

    public static int getDigitCount(int number) {
        if(number < 0){
            return -1;
        }

        return String.valueOf(number).length();
    }
}