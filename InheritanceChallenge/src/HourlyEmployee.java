public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        int workedHours = 168;
        return (this.hourlyPayRate * workedHours);
    }

    public double getDoublePay() {
        return (collectPay() * 2);
    };
}
