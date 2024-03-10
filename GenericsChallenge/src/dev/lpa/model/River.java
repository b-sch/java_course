package dev.lpa.model;

import java.util.ArrayList;
import java.util.List;

public class River extends Line implements Mappable{

    private List<Coordinates> coords = new ArrayList<>();

    public River(String name, Coordinates initialCoords) {
        super(name);
        this.coords.add(initialCoords);
    }

    @Override
    public void render() {
        System.out.printf("%s (%s) %n", super.renderInfo, coords.toString());
    }

    public void extendRiver(Coordinates newCoords) {
        this.coords.add(newCoords);
    }
}

