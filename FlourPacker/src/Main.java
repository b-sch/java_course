public class Main {
    public static void main(String[] args) {

        int multiplier = 5;
        int num1 = 5;
//        int num2 = 0;
        int goal = 24;

        System.out.println("num 1 = " + num1);
//        System.out.println("num 2 = " + num2);
        System.out.println("goal = " + goal);
        System.out.println("goal / num1 = " + Math.floor((double) goal / num1));
//        System.out.println("(goal / num1) + num2 = " + ((goal / num1) + num2));

//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 0, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 11));
//        System.out.println(canPack(-3, 2, 11));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        bigCount *= 5;

        if ((bigCount + smallCount) < goal) {
            return false;
        }

        if ((bigCount + smallCount) == goal) {
            return true;
        }

        if ((bigCount + smallCount) > goal) {
            if (bigCount == 0) {
                return true;
            }

            if (smallCount == 0) {
                if ((goal % bigCount) == 0) {
                    return true;
                } else {
                    return false;
                }
            }

            if (bigCount > goal) {
                return ((goal / 5) * 5) + smallCount >= goal;
            }

            return true;
        }

        return false;
    }
}