import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        userInputController();

    }

    public static double getInputFromScanner(int inputRequestIndex){
        Scanner scanner = new Scanner(System.in);
        double input = 0;

        do {
            try {
                System.out.printf("Enter a number #%1$d \n", inputRequestIndex);
                input = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input data. Enter only numbers.");
            }
        } while (input == 0);

        return input;
    }

    public static void userInputController(){
        double sumOfUserInput = 0;

        for (int i = 1; i <= 5; i++) {
            sumOfUserInput += getInputFromScanner(i);
        }

        System.out.println("Sum of all entered numbers is = " + sumOfUserInput);
    }
}