package myprojects.proj1;

import java.util.ArrayList;


public class MobilePhone
{
    ArrayList<Contact> Contacts = new ArrayList<>();



    public void addContact(int phoneNr,String fName)
    {
        Contacts.add(new Contact(phoneNr,fName));

    }
    public void removeContact(int phNr,String Name)
    {
        int index = searchContact(phNr,Name);
        if(index >= 0)
        {
            Contacts.remove(index);
            System.out.println("Contact removed");
        }
        else {


        }

    }



    public void listContacts()
    {
        System.out.println(Contacts);

    }
    public void updateContact(int phNr,String Name,String newName)
    {
    int index = searchContact(phNr,Name);
    if(index >= 0)
    {
        Contacts.set(index,new Contact(phNr,newName));
        System.out.println("Contact Updated");
    }
    else {


    }

    }
    public void updateContact(int phNr,String Name,int newphNr,String newName)
    {
        int index = searchContact(phNr,Name);
        if(index >= 0)
        {
            Contacts.set(index,new Contact(newphNr,newName));
            System.out.println("Contact Updated");
        }
        else {


        }

    }

    public void updateContact(int phNr,String Name,int newPhNr)
    {
        int index = searchContact(phNr,Name);
        if(index >= 0)
        {
            Contacts.set(index,new Contact(newPhNr,Name));
            System.out.println("Contact Updated");
        }
        else {


        }

    }
    public int searchContact(int phNr,String name)
    {
        int index = Contacts.indexOf(new Contact(phNr,name));
        if (index < 0)
        {
            System.out.println("There is no such contact");
            return -1;
        }

        return index;

    }



}
