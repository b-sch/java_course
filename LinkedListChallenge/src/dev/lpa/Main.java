package dev.lpa;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<PlaceToVisit> placesToVisit = new LinkedList<>();

        placesToVisit.add(new PlaceToVisit("Sydney", 0));
        placesToVisit.add(new PlaceToVisit("Adelaide", 1354));
        placesToVisit.add(new PlaceToVisit("Alice Springs", 2771));
        placesToVisit.add(new PlaceToVisit("Brisbane", 971));
        placesToVisit.add(new PlaceToVisit("Darwin", 3972));
        placesToVisit.add(new PlaceToVisit("Melbourne", 877));
        placesToVisit.add(new PlaceToVisit("Perth", 3923));

        sortList(placesToVisit);
        addPlaceToVisit(placesToVisit, new PlaceToVisit("Adelaide", 0));
        sortList(placesToVisit);

        Menu.run(placesToVisit);

    }

    private static void sortList(LinkedList<PlaceToVisit> list) {
//        System.out.println("List before sorting: " + list);

        list.sort(new Comparator<PlaceToVisit>() {
            @Override
            public int compare(PlaceToVisit o1, PlaceToVisit o2) {
                return o1.getDistanceFromStart() - o2.getDistanceFromStart();
            }
        });

//        System.out.println("List after sorting: " + list);
    }

    private static void addPlaceToVisit(LinkedList<PlaceToVisit> list, PlaceToVisit place) {
        ListIterator<PlaceToVisit> iterator = list.listIterator();
        boolean isDuplicate = false;

        while(iterator.hasNext()) {
            PlaceToVisit currentElement = iterator.next();

            if (currentElement.getPlaceName().equals(place.getPlaceName())) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
//            System.out.println("Place: " + place + " is already in the list - not adding...");
        } else {
//            System.out.println("Place: " + place + " is NOT in the list - adding...");
            list.add(place);
        }
    }
}