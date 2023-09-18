package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        runMenu(groceryList);

    }

    private static void runMenu(ArrayList<String> arrayList) {
        Scanner scanner = new Scanner(System.in);

        menuLoop:
        while (true) {
            drawHeadline();

            String userInput = scanner.nextLine();


            switch (userInput) {
                case "0" -> {
                    System.out.println("Exiting the application... ");
                    break menuLoop;
                }
                case "1" -> {
                    System.out.println("Please specify elements that should be added to the list...");
                    addElementsToList(scanner, arrayList);
                }
                case "2" -> {
                    System.out.println("Please specify elements that should be removed from the grocery list:");
                    removeElementsFromList(scanner, arrayList);
                }
                default -> {
                    System.out.println("Wrong input. You need to enter 0, 1 or 2.");
                }
            }
        }
    }

    private static void drawHeadline() {
        System.out.println("""
                =============
                
                Available actions:
                                
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                               
                Enter a number for which action you want to do:
                
                =============
                """);
    }

    private static void addElementsToList(Scanner scanner, ArrayList<String> arrayList) {
        String[] userInput = scanner.nextLine().split(",");

        for (String element : userInput) {
            if (!arrayList.contains(element.strip())) {
                arrayList.add(element.strip());
            } else {
                System.out.printf("Grocery list already contains: %s - skipping addition %n", element);
            }
        }

        arrayList.sort(Comparator.naturalOrder());

        System.out.printf("After adding the elements list contains: %s%n", arrayList.toString());
    }

    private static void removeElementsFromList(Scanner scanner, ArrayList<String> arrayList) {
        String[] userInput = scanner.nextLine().split(",");

        for (String element : userInput) {
            if (arrayList.contains(element.strip())) {
                arrayList.remove(element.strip());
            } else {
                System.out.printf("Grocery list does not contain: %s - skipping removal %n", element);
            }
        }

        arrayList.sort(Comparator.naturalOrder());

        System.out.printf("After adding the elements list contains: %s%n", arrayList.toString());
    }
}