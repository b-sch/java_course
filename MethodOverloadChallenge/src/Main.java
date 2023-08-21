public class Main {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));
    }

    public static double convertToCentimeters(int heightInches) {
        return heightInches * 2.54d;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {
        return convertToCentimeters((heightFeet * 12) + heightInches);
    }
}