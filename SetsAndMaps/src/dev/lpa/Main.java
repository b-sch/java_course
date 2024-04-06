package dev.lpa;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);
    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(50) + "%n%s%n".formatted(header) + "-".repeat(50));
        contacts.forEach(System.out::println);
    }
}