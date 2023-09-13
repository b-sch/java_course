package dev.lpa;

import java.util.Arrays;

public class ReverseArray {

    public static void run() {
        int[] array = new int[] {1,2,3,4,5,6};
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.printf("Array = %s%n", Arrays.toString(array));
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int element : array) {
            reversedArray[maxIndex--] = element;
        }
        System.out.printf("Reversed array = %s%n", Arrays.toString(reversedArray));
    }
}
