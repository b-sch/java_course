import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNums = new int[10];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(100);
        }

        Arrays.sort(randomNums);

        int[] randomNumsReversed = Arrays.copyOf(randomNums, randomNums.length);
        for (int i = 0; i < randomNumsReversed.length; i++) {
            randomNumsReversed[i] = randomNums[(randomNumsReversed.length - 1) - i];
        }

        System.out.printf("randomNums sorted:%43s%n", Arrays.toString(randomNums));
        System.out.printf("randomNums reversed:%41s%n", Arrays.toString(randomNumsReversed));
    }
}