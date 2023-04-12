public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mike = new HourlyEmployee("Mike", "12/12/1984", "06/06/2020", 8.0d);
        System.out.println(mike);
        System.out.println("Age = " + mike.getAge());
        System.out.println("Mike's Paycheck = $" + mike.collectPay());
        System.out.println("Mike's Paycheck after working extra hours = $" + mike.getDoublePay());
    }
}