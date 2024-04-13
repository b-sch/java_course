import java.util.logging.Logger;

public class Tests {

    private static Logger LOGGER = null;

    static {
        System.setProperty(
                "java.util.logging.SimpleFormatter.format",
                "[%1$tF %1$tT] [%4$-7s] %5$s %n");
        // Logger to get logs
        LOGGER = Logger.getLogger(Tests.class.getName());
    }

    public static void main(String[] args) {


        // Prevents logging twice

        // Example log messages
        LOGGER.info("This is an info message.");
        LOGGER.warning("This is a warning message.");
    }
}
