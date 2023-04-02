public class Main {
    public static void main(String[] args) {

        printSquareStar(-0);

    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {

            for (int column = 1; column <= number; column++) {

                // print first and last row
                if (row == 1) {
                    System.out.print("*");
                } else if (row == number) {
                    System.out.print("*");
                }

                // print if not on first and last row

                if ((row > 1) && (row != number)) {

                    // check if star should be printed, if not, print empty space
                    if (column == 1) {
                        System.out.print("*");
                    } else if (column == number) {
                        System.out.print("*");
                    } else if (column == row) {
                        System.out.print("*");
                    } else if(column == (number - row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }

            }

            System.out.print("\n");
        }
    }
}