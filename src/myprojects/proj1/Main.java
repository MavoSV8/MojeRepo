package myprojects.proj1;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void Menu(int option, MobilePhone mobile) throws InterruptedException {
        Scanner input2 = new Scanner(System.in);
        int phoneNumber;
        String contactName;

        switch (option){
           case 1:
               mobile.listContacts();
           break;
           case 2:
               System.out.println("Type number of contact you want to add:");
               phoneNumber = input2.nextInt();
               input2.nextLine();
               System.out.println("Type name of contact you want to add:");
               contactName = input2.nextLine();
               mobile.addContact(phoneNumber,contactName);
               break;
           case 3:
               System.out.println("Type number of contact you want to remove:");
               phoneNumber = input2.nextInt();
               input2.nextLine();
               System.out.println("Type name of contact you want to remove:");
               contactName = input2.nextLine();
               mobile.removeContact(phoneNumber,contactName);
               break;
           case 4:
               System.out.println("Type old number:");
               int phoneNumberold = input2.nextInt();
               input2.nextLine();
               System.out.println("Type new number:");
               int phoneNumbernew = input2.nextInt();
               input2.nextLine();
               System.out.println("Type old name:");
               String contactNameold = input2.nextLine();
               System.out.println("Type new name:");
               String contactNamenew = input2.nextLine();
               mobile.updateContact(phoneNumberold,contactNameold,phoneNumbernew,contactNamenew);
               break;
           case 5:
               System.out.println("Type number of contact you want to find:");
               phoneNumber = input2.nextInt();
               input2.nextLine();
               System.out.println("Type name of contact you want to find:");
               contactName = input2.nextLine();

               mobile.searchContact(phoneNumber,contactName);
               break;
            case 6:
                System.out.println("Quitting.");
                TimeUnit.SECONDS.sleep(3);
                System.exit(1);
                break;
       }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        MobilePhone Nokia = new MobilePhone();
        //Nokia.addContact(1,"a");
        //Nokia.searchContact(1,"a");
        while(true) {
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
            Menu(option, Nokia);
        }
    }
}
