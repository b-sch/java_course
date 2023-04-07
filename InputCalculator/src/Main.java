import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double inputCounter = 0;

        while(true){
            try {
                sum += Integer.parseInt(scan.nextLine());
                inputCounter++;
            } catch (NumberFormatException NFP) {
                if (inputCounter == 0) {
                    System.out.println("SUM = 0 AVG = 0");
                } else {
                    System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(sum / inputCounter));
                }
                break;
            }
        }
    }

}