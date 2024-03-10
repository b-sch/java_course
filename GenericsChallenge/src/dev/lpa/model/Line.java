package dev.lpa.model;

public class Line implements Mappable {
    protected String name;
    protected String renderInfo;

    public Line(String name) {
        this.name = name;
        this.renderInfo = "Render %s as %s".formatted(name, "line".toUpperCase());
    }

    @Override
    public void render() {
        System.out.printf(renderInfo);
    }
}
