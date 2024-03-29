import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }

        }

        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists");
            System.out.println("Update was not successful");
            return false;
        }

        this.myContacts.set(position, newContact);
        System.out.println( oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }

        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);

        if (position >= 0){
            return this.myContacts.get(position);
        }

        return null;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }

        this.myContacts.remove(position);
        System.out.println(contact.getName() + " was deleted");

        return true;
    }

    public void printContacts(){
        System.out.println("Contact list is as follows:");
        for (int i=0; i<this.myContacts.size(); i++){
            System.out.println(this.myContacts.get(i).getName() + " -> "  +
                                this.myContacts.get(i).getPhoneNumber());
        }
    }
}
