import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double minNumber = 0.0d;
        double maxNumber = 0.0d;
        double currentNumber;

        System.out.println("============== MIN MAX CHALLENGE ================");
        System.out.println("1. Program will repeatedly ask You to provide a number.");
        System.out.println("2. Program will remember smallest and highest number You have entered.");
        System.out.println("3. If You want to quit, type in any character that is not a number.");
        System.out.println("================================================= \n");

        while(true) {
            System.out.println("Please provide a number: ");

            try {
                currentNumber = Double.parseDouble(scan.nextLine());

                if ((currentNumber == minNumber) && (currentNumber == maxNumber)){
                    maxNumber = currentNumber;
                } else if(currentNumber < maxNumber) {
                    minNumber = currentNumber;
                } else {
                    maxNumber = currentNumber;
                }

            } catch (NumberFormatException NFE) {
                System.out.println("Thank You for using the program! \n");
                break;
            }
        }

        System.out.println("Smallest number was: " + minNumber);
        System.out.println("Biggest number was: " + maxNumber);

    }

}