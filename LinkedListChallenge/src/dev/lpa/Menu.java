package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Menu {
    private static String menuContent = """
                        
            Available actions ():
            (F)orward
            (B)ackward
            (L)ist Places
            (M)enu
            (Q)uit
                        
            """;

    public static void run(LinkedList<PlaceToVisit> list) {
        Scanner scanner = new Scanner(System.in);

        displayContent();

        menuLoop:
        while (true) {
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "F", "Forward" -> {
                    System.out.println("Moving forwards through the list...");
                    moveForwardThroughList(list);
                }
                case "B", "Backward" -> {
                    System.out.println("Moving backwards through the list...");
                    moveBackwardThroughList(list);
                }
                case "L", "List Places" -> {
                    System.out.println("Listing Places: ");
                    listPlaces(list);
                }
                case "M", "Menu" -> {
                    System.out.println("Displaying menu...");
                    displayContent();
                }
                case "Q", "Quit" -> {
                    System.out.println("Closing application...");
                    break menuLoop;
                }
                default -> {
                    System.out.println("Your input was incorrect; You can only use: \"F\", \"B\", \"L\", \"M\", \"Q\", \"Forward\", \"Backward\", \"List Places\", \"Menu\", \"Quit\"");
                }
            }
        }
    }

    private static void displayContent() {
        System.out.println(menuContent);
    }

    private static void moveForwardThroughList(LinkedList<PlaceToVisit> list) {
        ListIterator<PlaceToVisit> iterator = list.listIterator();

        while(iterator.hasNext()) {
            PlaceToVisit currentPlace = iterator.next();
            System.out.print(currentPlace.getPlaceName() + ", ");
        }

        System.out.println();
    }

    private static void moveBackwardThroughList(LinkedList<PlaceToVisit> list) {
        ListIterator<PlaceToVisit> iterator = list.listIterator(list.size() - 1);

        while(iterator.hasPrevious()) {
            PlaceToVisit currentPlace = iterator.previous();
            System.out.print(currentPlace.getPlaceName() + ", ");
        }

        System.out.println();
    }

    private static void listPlaces(LinkedList<PlaceToVisit> list) {
        ListIterator<PlaceToVisit> iterator = list.listIterator();

        while(iterator.hasNext()) {
            PlaceToVisit currentPlace = iterator.next();
            System.out.println("===> " + currentPlace.getPlaceName());
        }

        System.out.println();
    }

}
