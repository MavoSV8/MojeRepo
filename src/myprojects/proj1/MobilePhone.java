package myprojects.proj1;

import java.util.ArrayList;


public class MobilePhone
{
    ArrayList<Contact> Contacts = new ArrayList<>();



    public void addContact(int phoneNr,String fName)
    {
        Contacts.add(new Contact(phoneNr,fName));

    }
    public void removeContact(String phN)
    {


    }



    public void listContacts()
    {
        System.out.println(Contacts);

    }
    public void updateContact(int phNr,String Name,String newName)
    {
    int index = searchContact(phNr,Name);
    if(index < 0)
    {
        System.out.println("There is no such contact");
    }
    else {
      Contacts.set(index,new Contact(phNr,newName));
        System.out.println("Contact Updated");

    }

    }
    public void updateContact(int phNr,String Name,int newPhNr)
    {
        int index = searchContact(phNr,Name);
        if(index < 0)
        {
            System.out.println("There is no such contact");
        }
        else {
            Contacts.set(index,new Contact(newPhNr,Name));
            System.out.println("Contact Updated");

        }

    }
    public int searchContact(int phNr,String name)
    {
        int index = Contacts.indexOf(new Contact(phNr,name));
        if (index < 0)
        {

            return -1;
        }

        return index;

    }



}
