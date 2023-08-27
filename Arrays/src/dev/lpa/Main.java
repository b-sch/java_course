package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5d;

        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray = new int[]{5, 4, 3, 2, 1};

        newArray = new int[5];

        for(int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArrray = new Object[3];
        objectArrray[0] = "Hello";
        objectArrray[1] = new StringBuilder("World");
        objectArrray[2] = newArray;
        System.out.println(Arrays.toString(objectArrray));

    }
}