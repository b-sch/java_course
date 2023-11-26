package dev.lpa;

public class PlaceToVisit {
    private String placeName;
    private int distanceFromStart;

    @Override
    public String toString() {
        return this.placeName + " - " + this.distanceFromStart;
    }

    public PlaceToVisit(String placeName, int distanceFromStart) {
        this.placeName = placeName;
        this.distanceFromStart = distanceFromStart;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getDistanceFromStart() {
        return distanceFromStart;
    }

    public void setDistanceFromStart(int distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }
}
