package myprojects.proj1;

import java.util.ArrayList;


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
    public int searchContact(String phNr,String name)
    {
        int index = Contacts.indexOf(new Contact(phNr,name));
        if (index < 0)
        {
            System.out.println("There is no such contact");

        }

        return index;

    }



}
