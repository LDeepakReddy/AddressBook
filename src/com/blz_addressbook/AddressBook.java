package com.blz_addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static List<Contacts> Contacts=new ArrayList<>();
    Scanner Sc=new Scanner(System.in);

    public void addContacts(){
        System.out.println("Enter the contact Information");
        Contacts contacts=new Contacts();

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
}
