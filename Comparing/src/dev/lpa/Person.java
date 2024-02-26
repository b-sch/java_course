package dev.lpa;

public class Person implements Comparable<Person> {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
        if (p.name.equalsIgnoreCase(this.name)) {
            return 0;
        } else {
            return 1;
        }
    }
}
