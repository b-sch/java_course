public class Main {
    public static void main(String[] args) {

        char testCharacter = 'Q';

        switch (testCharacter) {
            case 'A':
                System.out.println(testCharacter + " = Able");
                break;
            case 'B':
                System.out.println(testCharacter + " = Baker");
                break;
            case 'C':
                System.out.println(testCharacter + " = Charlie");
                break;
            case 'D':
                System.out.println(testCharacter + " = Dog");
                break;
            case 'E':
                System.out.println(testCharacter + " = Easy");
                break;
            default:
                System.out.println("Letter " + testCharacter + " was not found");
                break;

        }
    }

}