package dev.lpa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact {

    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, long phone) {
        this(name, null, phone);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        if (!(email == null || email.isEmpty())) this.emails.add(email);
//        this.phones.add(parsePhoneNumber(phone)); // my solution
        if (phone > 0) {
            String p = String.valueOf(phone);
            p = "(%s) %s-%s".formatted(p.substring(0, 3), p.substring(3, 6), p.substring(6));
            phones.add(p);
        }

    }

    private String parsePhoneNumber(long phoneNumber) {
        if (String.valueOf(phoneNumber).length() != 10)
            throw new IllegalArgumentException("Phone number was longer or shorter than 10 digits");
        if (phoneNumber < 0) phoneNumber *= -1;

        return "(%s) %s-%s".formatted(
                String.valueOf(phoneNumber).substring(0, 3),
                String.valueOf(phoneNumber).substring(3, 6),
                String.valueOf(phoneNumber).substring(6)
        );
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return "%s%n Emails: %s%n Phone numbers: %s%n".formatted(name, emails, phones); // my solution
        return "%-20s: %-30s %-30s".formatted(name, emails, phones);
    }

    public Contact mergeContactData(Contact contact) {

        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);

        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);

        return newContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName());
    }

    @Override
    public int hashCode() {
        return 33 * Objects.hashCode(getName());
    }

    public void addEmail(String companyName) {

        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.charAt(0), names[names.length - 1], companyName.replaceAll(" ", "").toLowerCase());
        if (!emails.add(email)) {
            System.out.println(name + " already has email: " + email);
        } else {
            System.out.println(name + " now has email " + email);
        }
    }


    public void replaceEmailIfExists(String oldEmail, String newEmail) {

        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }

}