package dev.lpa;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> taskSet = new HashSet<>(TaskData.getData());
        taskSet.forEach(System.out::println);
    }
}