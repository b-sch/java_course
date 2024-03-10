package dev.lpa.model;

public class Coordinates {
    private Double latitude;
    private Double longitude;

    public Coordinates(Double latitude, Double longitude) {
        this.latitude = latitude % 90;
        this.longitude = longitude % 180;
    }

    @Override
    public String toString() {
        return "[%.3f , %.3f]".formatted(latitude, longitude);
    }
}