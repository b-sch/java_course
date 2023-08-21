public class Main {

    public static void main(String[] args) {

        int number = 5;
        int end = 20;
        int counterEven = 0;
        int counterOdd = 0;

        while(number <= end) {
            if(isEvenNumber(number)) {
                System.out.println(number + " is even");
                counterEven++;
            } else {
                System.out.println(number + " is odd");
                counterOdd++;
            }

            if(counterEven == 5) {
                System.out.println("number of even numbers = " + counterEven);
                System.out.println("number of odd numbers = " + counterOdd);
                break;
            }

            number++;
        }

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
