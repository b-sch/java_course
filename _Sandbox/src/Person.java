public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "%s %s".formatted(firstName, lastName);
    }

    @Override
    public int compareTo(Person p1) {
        return this.lastName.compareTo(p1.lastName);
    }
}
