package dev.lpa.model;

public class Point implements Mappable {
    protected String name;
    protected String renderInfo;

    public Point(String name) {
        this.name = name;
        this.renderInfo = "Render %s as %s".formatted(name, "point".toUpperCase());
    }

    @Override
    public void render() {
        System.out.printf(renderInfo);
    }
}