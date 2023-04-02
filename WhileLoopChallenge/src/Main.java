public class Main {
    public static void main(String[] args) {

        int number = 4;
        int endNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        while(number <= endNumber) {
//            number++;
//            if(isEvenNumber(number)){
//                evenCount++;
//                System.out.printf("The number %1$d is even \n", number);
//            } else {
//                oddCount++;
//                System.out.printf("The number %1$d is odd \n", number);
//            }
//            if(evenCount == 5) {
//                System.out.println("Found 5 even numbers, terminating the loop.");
//                System.out.printf("Found %1$d odd numbers.", oddCount);
//                break;
//            }
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);


    }

    public static boolean isEvenNumber(int number) {
            return (number % 2) == 0;
    }
}