public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine has been started.");
    }

    public void drive() {
        this.runEngine();
        System.out.println("Car is being driven.");
    }

    protected void runEngine() {
        System.out.println("Engine runs.");
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = (avgKmPerLitre <= 0) ? 1 : avgKmPerLitre;
        this.cylinders = (cylinders <= 0) ? 1 : cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas-powered engine has been started. This engine has: " + this.cylinders + " cylinders.");
    }

    @Override
    public void drive() {
        System.out.println("Method called from: " + this.getClass().getSimpleName());
        super.runEngine();
        System.out.println("Gas-powered car is being driven");
    }

    public Car getCar(String type, String description) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description, 25.0d, 4);
            case 'E' -> new ElectricCar(description, 300.0d, 10);
            case 'H' -> new HybridCar(description, 5.5d, 4, 10);
            default -> new Car("unknown car");
        };
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = (avgKmPerCharge <= 0) ? 1 : avgKmPerCharge;

    }

    @Override
    public void startEngine() {
        System.out.println("Electric engine has been started. Remaining battery life after full charge: " + avgKmPerCharge);
    }

    @Override
    public void drive() {
        System.out.println("Method called from: " + this.getClass().getSimpleName());
        super.runEngine();
        System.out.println("Electric car is being driven");
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = (avgKmPerLitre <= 0) ? 1 : avgKmPerLitre;
        this.cylinders = (cylinders <= 0) ? 1 : cylinders;
        this.batterySize = (batterySize <= 0) ? 1 : batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid engine has been started. On average, it can run " + avgKmPerLitre + " km per 1 litre of gas.");
    }

    @Override
    public void drive() {
        System.out.println("Method called from: " + this.getClass().getSimpleName());
        super.runEngine();
        System.out.println("Hybrid car is being driven");
    }
}