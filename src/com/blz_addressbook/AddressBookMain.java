package com.blz_addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");
        System.out.println("1. Add contacts to the addressbook.");
        System.out.println("2. Modify the contact");
        System.out.println("3. Delete the contact");
        AddressBook addressBook = new AddressBook();
        Scanner Sc = new Scanner(System.in);
        int operations = Sc.nextInt();
        while (operations != 0) {
            switch (operations) {
                case 1:
                    System.out.println("How many contacts you want to add");
                    int contactsCount = Sc.nextInt();
                    for (int i = 0; i < contactsCount; i++) {
                        addressBook.addContacts();
                    }
                    for (int i = 0; i < contactsCount; i++) {
                        System.out.println(AddressBook.Contacts.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter the contact which you want to modify");
                    String check = Sc.next();
                    addressBook.modifyContacts(check);
                    break;
                case 3:
                    System.out.println("Enter the contact which you want to delete");
                    String delete =Sc.next();
                    addressBook.deleteContacts(delete);
            }
            System.out.println("1. Add contacts to the addressbook.");
            System.out.println("2. Modify the contact");
            System.out.println("3. Delete the contact");
            operations = Sc.nextInt();
        }
    }

}