package dev.lpa;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");

        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);

        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        System.out.println("=".repeat(50));

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org");
        System.out.println(robinHood);

        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A ∪ B) Union of emails (A) with phones (B)", unionAB);

        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersect emails (A) and phones (B)", intersectAB);

        Set<Contact> intersectBA = new HashSet<>(phoneContacts);
        intersectBA.retainAll(emailContacts);
        printData("(B ∩ A) Intersect phones (A) and emails (B)", intersectBA);

        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts);
        printData("(A - B) emails (A) - phones (B)", AMinusB);

        Set<Contact> BMinusA = new HashSet<>(phoneContacts);
        BMinusA.removeAll(emailContacts);
        printData("(B - A) phones (A) - emails (B)", BMinusA);

        Set<Contact> symmetricDiff = new HashSet<>(AMinusB);
        symmetricDiff.addAll(BMinusA);
        printData("Symmetric difference: phones and emails", symmetricDiff);

        Set<Contact> symmetricDiff2 = new HashSet<>(unionAB);
        symmetricDiff2.removeAll(intersectAB);
        printData("Symmetric difference: phones and emails", symmetricDiff2);

        
    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(50) + "%n%s%n".formatted(header) + "-".repeat(50));
        contacts.forEach(System.out::println);
    }

}