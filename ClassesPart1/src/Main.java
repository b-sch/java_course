public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(3);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        car.describeCar();

        Car targa = new Car();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}