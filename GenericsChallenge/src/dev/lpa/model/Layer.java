package dev.lpa.model;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends  Mappable> {

    private List<Mappable> mappables = new ArrayList<>();

    public Layer(List<Mappable> mappables) {
        this.mappables = mappables;
    }

    public void addMappableObject(Mappable mappableObject) {

        if (!mappables.contains(mappableObject)) {
            mappables.add(mappableObject);
        }
    }

    public void renderLayer() {
        mappables.forEach((s) -> s.render());
    }
}
