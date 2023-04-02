public class Main {

    public static void main(String[] args) {

//        System.out.println(hasSameLastDigit(9,10,10));
//        System.out.println(hasSameLastDigit(10,9,10));
//        System.out.println(hasSameLastDigit(10,10,9));
//        System.out.println(hasSameLastDigit(1001,10,10));
//        System.out.println(hasSameLastDigit(10,1001,10));
//        System.out.println(hasSameLastDigit(10,10,1001));
//        System.out.println(hasSameLastDigit(10,10,10));
//        System.out.println(hasSameLastDigit(1000,1000,1000));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if ((isValid(num1)) && (isValid(num2)) && isValid(num3)) {

            int lastDigitOfNum1 = num1 % 10;
            int lastDigitOfNum2 = num2 % 10;
            int lastDigitOfNum3 = num3 % 10;

            return (lastDigitOfNum1 == lastDigitOfNum2) || (lastDigitOfNum2 == lastDigitOfNum3) || (lastDigitOfNum1 == lastDigitOfNum3);
        }

        return false;
    }

    public static boolean isValid(int number) {

        if (number < 10){
            return false;
        }

        if (number > 1000){
            return false;
        }

        return true;
    }
}