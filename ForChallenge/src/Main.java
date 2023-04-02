import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        int primeNumberCounter = 0;

        for (int i = 0; i <= 1000; i++) {
            if (primeNumberCounter == 3){
                break;
            }

            if (isPrimeNumber(i)) {
                System.out.println("Found a Prime Number! It is: " + i);
                primeNumberCounter++;
            } else {
                System.out.println(i + " is NOT a Prime Number");
            }
        }

    }

    public static boolean isPrimeNumber(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }
}