import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class OneLineFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getLevel() + " "
                + record.getLoggerName() + " - "
                + record.getMessage() + "\n";
    }
}