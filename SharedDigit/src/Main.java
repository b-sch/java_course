public class Main {

    public static void main(String[] args) {

//        System.out.println(hasSharedDigit(9,20));
//        System.out.println(hasSharedDigit(100,20));
//        System.out.println(hasSharedDigit(20,9));
//        System.out.println(hasSharedDigit(9,100));
        System.out.println(hasSharedDigit(12,43));

    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int initialValueNum1 = num1;
        int initialValueNum2 = num2;

        while(num1 > 0) {
            System.out.printf("\ncurrent digit of %s is %s\n", num1, num1 % 10);

            num2 = initialValueNum2;
            while(num2 > 0) {
                if ((num2 % 10) == (num1 % 10)) {
                    System.out.printf("%s has an equal digit with %s", num1, num2);
                    return true;
                }
                System.out.printf("\ncurrent digit of %s is %s, checking against %s\n", initialValueNum2, num2 % 10, num1 % 10);
                num2 /= 10;
            }
            num1 /= 10;
        }

        return false;
    }
}
