public class Main {
    public static void main(String[] args) {

//        printAllDivisors(21);

//        getLargestPrime(100);
        String formattedText = "Largest prime factor for %1$d is %2$d \n";

        System.out.printf(formattedText, 21, getLargestPrime(21));
        System.out.printf(formattedText, 7, getLargestPrime(7));
        System.out.printf(formattedText, 217, getLargestPrime(217));
        System.out.printf(formattedText, 0, getLargestPrime(0));
        System.out.printf(formattedText, 45, getLargestPrime(45));
        System.out.printf(formattedText, -1, getLargestPrime(-1));

//        for(int i = 0; i <= 100; i++){
//            System.out.println("Is number " + i + " a prime number? Answer: " + isPrime(i));
//        }
    }

    public static int getLargestPrime(int number) {
        if ((number < 0) || (number == 0) || (number == 1)) {
            return -1;
        }

        class PrimeChecker {
            boolean isPrime(int number) {
                if(number <= 1){
                    return false;
                }

                boolean primeSwitch = false;

                for(int i = 2; i <= number; i++){
                    if((number % i == 0) && (i < number)) {
                        primeSwitch = false;
                        break;
                    } else {
                        primeSwitch = true;
                    }
                }

                return primeSwitch;
            }
        }

        int lastPrimeFactor = 0;

        for(int i = 1; i <= number; i++) {
            if((number % i == 0) && (new PrimeChecker().isPrime(i))){
                lastPrimeFactor = i;
            }
        }


        return lastPrimeFactor;
    }

    public static boolean isPrime (int number) {
        if(number <= 1){
            return false;
        }

        boolean primeSwitch = false;

        for(int i = 2; i <= number; i++){
            if((number % i == 0) && (i < number)) {
                primeSwitch = false;
                break;
            } else {
                primeSwitch = true;
            }
        }

        return primeSwitch;
    }
}