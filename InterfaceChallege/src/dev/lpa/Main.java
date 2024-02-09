package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Building building = new Building(
                new Property(Descriptor.TYPE, GeometryType.POINT.toString()),
                new Property(Descriptor.LABEL, "School (EDUCATION)"),
                new Property(Descriptor.MARKER, MarkerType.RED_STAR.toString()),
                new Property(Descriptor.NAME, "School"),
                new Property(Descriptor.USAGE, LabelSubtype.EDUCATION.toString()));

        UtilityLine fiberOptic = new UtilityLine(
                new Property(Descriptor.TYPE, GeometryType.LINE.toString()),
                new Property(Descriptor.LABEL, "College St (FIBER_OPTIC)"),
                new Property(Descriptor.MARKER, MarkerType.GREEN_DOTTED.toString()),
                new Property(Descriptor.NAME, "College St"),
                new Property(Descriptor.UTILITY, LabelSubtype.FIBER_OPTIC.toString()));

        Mappable.printProperties(building);
        Mappable.printProperties(fiberOptic);
    }
}