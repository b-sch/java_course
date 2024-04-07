package dev.lpa;

import java.util.*;

public class TaskData {

    private static String allTasks = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, Medium
            Data Design, Employee Table, Medium
            Data Design, Cross Reference Tables, High
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low
            Data Access, Set Up Users, Low
            Data Access, Set Up Access Policy, Low
            """;

    public static Collection<Task> getData() {
        Scanner scanner = new Scanner(allTasks);
        Set<Task> targetSet = new HashSet<>();

        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(", ");
            targetSet.addAll(Arrays.asList(new Task(null, data[0], data[1], Priority.valueOf(data[2].toUpperCase()), null)));
        }

        return targetSet;
    }
}
