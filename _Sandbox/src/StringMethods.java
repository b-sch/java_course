public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "11/11/1990";
        int startingIndex = birthDate.indexOf("1990");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("-", "11", "11", "1990");
        System.out.println("newDate = " + newDate);

        newDate = "11".concat("/").concat("11").concat("/").concat("1990");
        System.out.println(newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("1", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("^1", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("     ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
