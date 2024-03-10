package dev.lpa.model;

import java.util.ArrayList;
import java.util.List;

public class Park extends Point {
    private List<Coordinates> coords = new ArrayList<>();

    public Park(String name, Coordinates initialCoords) {
        super(name);
        this.coords.add(initialCoords);
    }

    @Override
    public void render() {
        System.out.printf("%s (%s)", super.renderInfo, coords.getFirst().toString());
    }

}

