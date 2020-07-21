package myprojects.proj1;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone
{
    ArrayList<Contact> Contacts = new ArrayList<>();



    public void addContact(String phoneNr,String fName)
    {
        Contacts.add(new Contact(phoneNr,fName));

    }
    public void removeContact(String name)
    {


    }
    public void listContacts()
    {
        System.out.println(Contacts);

    }
    public void updateContact(String Name)
    {

    }
    public int searchContact(String name)
    {
        int index = Contacts.indexOf(name);

        return index;

    }



}
