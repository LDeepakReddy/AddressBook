package com.blz_addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static List<Contacts> Contacts = new ArrayList<>();
    Scanner Sc = new Scanner(System.in);

    public void addContacts() {
        System.out.println("Enter the contact Information");
        Contacts contacts = new Contacts();

        System.out.println("Enter the First Name ");
        contacts.setFirstName(Sc.next());

        System.out.println("Enter the Last Name");
        contacts.setLastName(Sc.next());

        System.out.println("Enter the Address");
        contacts.setAddress(Sc.next());

        System.out.println("Enter the City name");
        contacts.setCity(Sc.next());

        System.out.println("Enter the State name");
        contacts.setState(Sc.next());

        System.out.println("Enter the Zip code");
        contacts.setZip(Sc.nextInt());

        System.out.println("Enter the Phone number");
        contacts.setPhoneNumber(Sc.nextLong());

        System.out.println("Enter the Email");
        contacts.setEmail(Sc.next());

        Contacts.add(contacts);
    }

    public void modifyContacts(String modify) {
        for (int i = 0; i < Contacts.size(); i++) {
            Contacts contacts = (Contacts) Contacts.get(i);
            if (contacts.getFirstName().equals(modify)) {
                System.out.println("Which data you want to edit?");
                System.out.println("1.Edit First name");
                System.out.println("2.Edit Last name ");
                System.out.println("3.Edit Address");
                System.out.println("4.Edit Phone number");
                System.out.println("5.Edit City name");
                System.out.println("6.Edit Zip number");
                System.out.println("7.Edit Email address");

                switch (Sc.nextInt()) {
                    case 1:
                        contacts.setFirstName(Sc.next());
                        break;
                    case 2:
                        contacts.setLastName(Sc.next());
                        break;
                    case 3:
                        contacts.setAddress(Sc.next());
                        break;
                    case 4:
                        contacts.setPhoneNumber(Sc.nextLong());
                        break;
                    case 5:
                        contacts.setCity(Sc.next());
                        break;
                    case 6:
                        contacts.setZip(Sc.nextInt());
                        break;
                    case 7:
                        contacts.setEmail(Sc.next());
                        break;

                }


            }

            System.out.println(AddressBook.Contacts);
        }
    }

}


