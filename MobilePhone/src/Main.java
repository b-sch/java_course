public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("123456789");

        mobilePhone.printContacts();
        System.out.println(mobilePhone.addNewContact(Contact.createContact("Bob", "123")));
        mobilePhone.printContacts();
//        mobilePhone.invokeFindContact();
        mobilePhone.updateContact(Contact.createContact("Bob", "123"), Contact.createContact("Trevor", "111"));
        mobilePhone.printContacts();
        System.out.println(mobilePhone.queryContact("Trevor"));
        mobilePhone.removeContact(Contact.createContact("Trevor", "123"));
        mobilePhone.printContacts();
    }
}