import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers (int size) {
        Scanner scanner = new Scanner(System.in);
        int readNumber;
        int[] integers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please provide number to be put at index #" + i + ":");
            readNumber = scanner.nextInt();
            integers[i] = readNumber;
        }

        return integers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %s contents %s%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int[] arrayDescending = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayDescending.length; i++) {
            arrayDescending[i] = array[(arrayDescending.length - 1) - i];
        }
        return arrayDescending;
    }
}
