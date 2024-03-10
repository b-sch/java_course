import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaMiniChallenges {

    public static void main(String[] args) {

        Consumer<String> printTheParts = (sentence) -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printTheParts.accept("This is a sentence");

        Feedable thing = new Feedable() {
            @Override
            public void eat() {
                System.out.println("munching sounds");
            }
        };

        thing.eat();

        UnaryOperator<String> everySecondChar = (source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(Arrays.toString("test".split("")));

        System.out.println(deriveEverySecondCharacter(everySecondChar, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();

        System.out.println(supplierResult);
    }

    public static String deriveEverySecondCharacter(UnaryOperator<String> func, String source) {
        return func.apply(source);
    }
}
