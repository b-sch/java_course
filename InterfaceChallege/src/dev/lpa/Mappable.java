package dev.lpa;

public interface Mappable {
    String JSON_PROPERTY = "{\"properties\": {%s}}";

    static void printProperties(MapObject mapObject) {
        System.out.printf(JSON_PROPERTY, JSONExporter.toJSON(mapObject.propertiesList));
        System.out.println();
    };
}