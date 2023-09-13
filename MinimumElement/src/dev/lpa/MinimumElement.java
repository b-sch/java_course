package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        System.out.println("Input the size of the array:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static int[] readElements(int readSize) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfInts = new int[readSize];

        for(int i = 0; i < arrayOfInts.length; i++) {
            System.out.println("give a number:");
            arrayOfInts[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arrayOfInts));
        return arrayOfInts;
    }
    private static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void doAll() {
        findMin(readElements(readInteger()));
    }
}