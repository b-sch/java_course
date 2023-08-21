public class Main {
    public static void main(String[] args) {

        System.out.printf("area(5.0) result = %s \n", area(5.0));
        System.out.printf("area(-1) result = %s \n", area(-1));
        System.out.printf("area(5.0, 4.0) result = %s \n", area(5.0, 4.0));
        System.out.printf("area(-1.0, 4.0) result = %s \n", area(-1.0, 4.0));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0d;
        }

        return x * y;
    }
}