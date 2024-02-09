package dev.lpa;

import java.util.ArrayList;

public abstract class MapObject implements Mappable {
    protected ArrayList<Property> propertiesList = new ArrayList<>();

    public MapObject(Property geometryType, Property label, Property iconType) {
        propertiesList.add(geometryType);
        propertiesList.add(label);
        propertiesList.add(iconType);
    }
}
