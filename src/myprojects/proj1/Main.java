package myprojects.proj1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public void Menu(int option, MobilePhone mobile)
    {
        Scanner input = new Scanner(System.in);
        int phoneNumber;
        String contactName;

        switch (option){
           case 1:
               mobile.listContacts();
           break;
           case 2:

               phoneNumber = input.nextInt();
               input.nextLine();
               contactName = input.nextLine();
               mobile.addContact(phoneNumber,contactName);
               break;
           case 3:

               phoneNumber = input.nextInt();
               input.nextLine();
               contactName = input.nextLine();
               mobile.removeContact(phoneNumber,contactName);
               break;
           case 4:
               System.out.println("Type old number:");
               int phoneNumberold = input.nextInt();
               input.nextLine();
               System.out.println("Type new number:");
               int phoneNumbernew = input.nextInt();
               input.nextLine();
               System.out.println("Type old name:");
               String contactNameold = input.nextLine();
               System.out.println("Type new name:");
               String contactNamenew = input.nextLine();
               mobile.updateContact(phoneNumberold,contactNameold,phoneNumbernew,contactNamenew);
               break;
           case 5:
               phoneNumber = input.nextInt();
               input.nextLine();
               contactName = input.nextLine();
               mobile.searchContact(phoneNumber,contactName);
               break;
            case 6:
                System.out.println("Quitting.");
                TimeUnit.SECONDS.sleep(3);
                System.exit(1);
       }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MobilePhone Nokia = new MobilePhone();




        System.out.println("Menu");
        System.out.println("============================");
        System.out.println("1.Print list of contacts");
        System.out.println("2.Add contact");
        System.out.println("3.Remove contact");
        System.out.println("4.Update Contact");
        System.out.println("5.Find Contact");
        System.out.println("6.Quit");
        System.out.println("============================");
        System.out.println("Type number of option you want to choose:");
        int option = input.nextInt();
        input.nextLine();

    }
}
