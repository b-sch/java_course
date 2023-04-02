public class Main {
    public static void main(String[] args) {

//        System.out.println("Is 1 number an odd number? Answer: " + isOdd(1));
//        System.out.println("Is 2 number an odd number? Answer: " + isOdd(2));
//        System.out.println("Is 3 number an odd number? Answer: " + isOdd(3));
//        System.out.println("Is 4 number an odd number? Answer: " + isOdd(4));
//        System.out.println("Is 5 number an odd number? Answer: " + isOdd(5));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {
        if (!(number > 0)) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sumOfAllOdds = 0;

        if ((start < 0) || (end < start)) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfAllOdds += i;
                }
            }
        }
        return sumOfAllOdds;
    }

}