public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int foundNumbersTotalValue = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                if (counter == 5){
                    break;
                } else {
                    counter++;
                    foundNumbersTotalValue += i;
                    System.out.println("The number " + i + " is divisible by both 3 and 5");
                }
            }
        }

        for (int number = 100; number < 130; number += 10){
            System.out.println("number is: " + number);
        }

        System.out.println("The sum of all numbers divisible by 3 and 5 so far is: " + foundNumbersTotalValue);
    }
}