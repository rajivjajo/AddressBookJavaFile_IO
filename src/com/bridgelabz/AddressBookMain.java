package com.bridgelabz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddressBookMain {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome To AddressBook Program ");
        AddressBook addressBook1 = new AddressBook("Classmates");
        addressBook1.addContact(new Contact("Rajiv", "rj45@gmail.com", "999-456-7890", "Bluru", "KN"));
        addressBook1.addContact(new Contact("Dnyaneshwar", "dn46@gmail.com", "999-567-8901", "Pune", "MH"));

        AddressBook addressBook2 = new AddressBook("Family");
        addressBook2.addContact(new Contact("Rajiv", "rj45@gmail.com", "999-456-7890", "Bluru", "KN"));
        addressBook2.addContact(new Contact("Rishi", "rs23@gmail.com", "999-890-1234", "Bluru", "KN"));


        Map<String, List<Contact>> contactsByCity = addressBook1.getContactsByCity();
        System.out.println("Contacts by city:");
        for (Map.Entry<String, List<Contact>> entry : contactsByCity.entrySet()) {
            String city = entry.getKey();
            List<Contact> contacts = entry.getValue();
            System.out.println(city + ":");
            contacts.forEach(System.out::println);
            System.out.println();
        }
        Map<String, List<Contact>> contactsByState = addressBook1.getContactsByState();
        System.out.println("Contacts by state:");
        contactsByState.forEach((state, contacts) -> {
            System.out.println(state + ":");
            contacts.forEach(System.out::println);
            System.out.println();
        });

        // Write address books to file
        BufferedWriter writer = new BufferedWriter(new FileWriter("address_books.txt"));
        writer.write(addressBook1.toString());
        writer.write(addressBook2.toString());
        writer.close();
    }
}


