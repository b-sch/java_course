import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>(List.of(Contact.createContact("Bob", "123"), Contact.createContact("Mike", "456")));
    }

    public boolean addNewContact(Contact contact) {
        boolean isFound = findContact(contact) >= 0;

        if (!isFound) {
            this.myContacts.add(contact);
        }

        return isFound;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean isFound = findContact(oldContact) >= 0;
        if (isFound) {
            this.myContacts.set(findContact(oldContact), newContact);
            return isFound;
        } else {
            System.out.println("Contact was not found, cannot update the contact");
            return isFound;
        }
    }

    public boolean removeContact(Contact contact) {
        boolean isFound = findContact(contact) >= 0;
        if (isFound) {
            this.myContacts.remove(findContact(contact));
            return isFound;
        } else {
            return isFound;
        }
    }

    private int findContact(Contact contact) {
        int foundIndex = -1;
        boolean wasFound = false;
        Iterator<Contact> iterator = myContacts.iterator();

        while (iterator.hasNext()) {
            Contact listContact = iterator.next();
            foundIndex++;
            if ((listContact.getName().equals(contact.getName())) && (listContact.getPhoneNumber().equals(contact.getPhoneNumber()))) {
                wasFound = true;
                break;
            }
        }

        return wasFound ? foundIndex : -1;
    }

    private int findContact(String searchPhrase) {
        int foundIndex = -1;
        boolean wasFound = false;

        Iterator<Contact> iterator = myContacts.iterator();

        while (iterator.hasNext()) {
            Contact listContact = iterator.next();
            foundIndex++;
            if ((listContact.getName().equals(searchPhrase)) || (listContact.getPhoneNumber().equals(searchPhrase))) {
                wasFound = true;
                break;
            }
        }

        return wasFound ? foundIndex : -1;
    }

    public Contact queryContact(String contact) {
        Iterator<Contact> iterator = myContacts.iterator();

        while (iterator.hasNext()) {
            Contact listContact = iterator.next();
            if ((listContact.getName().equals(contact))) {
                return listContact;
            }
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%s. %s -> %s%n", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }
}
