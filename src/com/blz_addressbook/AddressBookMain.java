package com.blz_addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");
        Scanner Sc=new Scanner(System.in);
        AddressBook addressBook =new AddressBook();
        System.out.println("How many contacts you want to add");
        int contactsCount =Sc.nextInt();
        for (int i = 0; i< contactsCount;i++){
            addressBook.addContacts();
        }
        for (int i=0;i<contactsCount;i++){
            System.out.println(AddressBook.Contacts.get(i));
        }
    }
}
