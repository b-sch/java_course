package dev.lpa;

public class UtilityLine extends MapObject {
    private Property name;
    private Property utility;

    public UtilityLine(Property geometryType, Property label, Property iconType, Property name, Property utility) {
        super(geometryType, label, iconType);
        super.propertiesList.add(name);
        super.propertiesList.add(utility);
    }
}
