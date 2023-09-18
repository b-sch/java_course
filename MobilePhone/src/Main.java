public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("123456789");

        mobilePhone.printContacts();
        mobilePhone.addNewContact(Contact.createContact("Bob", "123"));
        mobilePhone.printContacts();

//        ArrayList<Integer> testList = new ArrayList<>(List.of(1,2,3));
//        System.out.println(testList.indexOf(0));
    }
}