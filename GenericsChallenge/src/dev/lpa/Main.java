package dev.lpa;

import dev.lpa.model.Coordinates;
import dev.lpa.model.Park;
import dev.lpa.model.River;

public class Main {
    public static void main(String[] args) {

        River odra = new River("Odra", new Coordinates(51.411506638997494, 16.447944423137685));

        odra.extendRiver(new Coordinates(51.143504229970276, 16.996472280919384));
        odra.extendRiver(new Coordinates(50.08233361922537, 18.235173821352294));

        odra.render();

        Park ojcowskiPN = new Park("Ojcowski Park Narodowy", new Coordinates(50.24080560684974, 19.8737684801199));

        ojcowskiPN.render();
    }
}