package dev.lpa;

import java.util.HashSet;
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
        return "%s: %s %s".formatted(name, emails, phones);
    }

    public Contact mergeContactData(Contact contact) {

        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);

        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);

        return newContact;
    }
}