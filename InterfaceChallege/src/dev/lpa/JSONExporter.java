package dev.lpa;

import java.util.ArrayList;
import java.util.ListIterator;

public class JSONExporter {

    public static String toJSON(ArrayList<Property> propertiesList) {
        ListIterator<Property> iterator = propertiesList.listIterator();
        StringBuilder stringBuilder = new StringBuilder();

        while(iterator.hasNext()) {
            Property currentProperty = iterator.next();
            stringBuilder.append(String.format("\"%s\": \"%s\"", currentProperty.descriptor().toString().toLowerCase(), currentProperty.value()));
            if (iterator.nextIndex() < propertiesList.size()) {
                stringBuilder.append(", ");
            }
        }

        return String.format(stringBuilder.toString());
    }
}
