import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private final ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>(List.of(Contact.createContact("Bob", "123"), Contact.createContact("Mike", "456")));
    }

    public boolean addNewContact(Contact contact)  {
        boolean isFound = findContact(contact) >= 0;
        if (isFound) {
            this.myContacts.add(contact);
            System.out.println("Value of: findContact(contact) >= 0 is: " + isFound);
        } else {
            System.out.println("Value of: findContact(contact) >= 0 is: " + isFound);
        }
        return isFound;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean isFound = findContact(oldContact) >= 0;
        if (!isFound) {
            this.myContacts.set(myContacts.indexOf(oldContact), newContact);
            return isFound;
        } else {
            return false;
        }

    }

    public boolean removeContact(Contact contact) {
        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private boolean findContact(String searchPhrase) {
        return false;
    }

    public Contact queryContact(String contact) {
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size();i++) {
            System.out.printf("%s: %s -> %s%n", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }
}
