package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] anArray = {54, 65, 1, 5, 3, 4, 8};
        reverse(anArray);
    }

    private static void reverse(int[] array) {
        System.out.println("Array before reversing: " + Arrays.toString(array));
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for(int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = array[(array.length - 1) - i];
        }
        System.out.println("Array after reversing: " + Arrays.toString(arrayCopy));
    }
}