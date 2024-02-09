package dev.lpa;

public class Building extends MapObject {
    private Property name;
    private Property usage;

    public Building(Property geometryType, Property label, Property iconType, Property name, Property usage) {
        super(geometryType, label, iconType);
        super.propertiesList.add(name);
        super.propertiesList.add(usage);
    }
}