public class Main {

    public static void main(String[] args) {

        numberToWords(0);

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.print("Zero ");
        }

        int reversedNumber = reverse(number);
        int amountOfZeros = getDigitCount(number) - getDigitCount(reversedNumber);

        while (reversedNumber > 0) {

            switch (reversedNumber % 10) {
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
                    System.out.println("Something went wrong ");
                    break;
            }

            reversedNumber /= 10;
        }

        if (getDigitCount(reversedNumber) != getDigitCount(number)) {
            for (int i = 0; i < amountOfZeros; i++) {
                System.out.print("Zero ");
            }
        }
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0;
        String reversedNumber = "";

        if (isNegative) {
            number = number * -1;
        }

        if (number == 0) {
            return 0;
        }

        while (number > 0) {
            reversedNumber += number % 10;
            number /= 10;
        }

        return isNegative ? Integer.parseInt(reversedNumber) * -1 : Integer.parseInt(reversedNumber);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int counter = 0;

        do {
            counter++;
            number /= 10;
        } while (number > 0);

        return counter;
    }
}
