import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0123456789");


    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("Enter action: (6 to show available actions )");
            int action = scanner.nextInt();
            scanner.nextLine(); // to flush the buffer

            switch (action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;

            }
        }
    }

    private static void queryContact() {
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Not deleted");
        }
    }

    private static void updateContact() {

        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newPhoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated");
        } else {
            System.out.println("Not updated");
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phoneNumber);

        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added " + name + " with " + phoneNumber);
        } else {
            System.out.println("Cannot add " + name + " with " + phoneNumber);
        }

    }

    private static void startPhone() {
        System.out.println("Phone is starting");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions");
        System.out.println("0 - shut down");
        System.out.println("1 - print contacts");
        System.out.println("2 - add a contact");
        System.out.println("3 - update an existing contact");
        System.out.println("4 - remove a contact");
        System.out.println("5 - query if a contact exists");
        System.out.println("6 - print the list of available actions");
        System.out.print("Choose your action: ");
    }
}