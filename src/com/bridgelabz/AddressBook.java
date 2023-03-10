package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBook {
    private String name;
    private List<Contact> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Map<String, List<Contact>> getContactsByCity() {
        return contacts.stream().collect(Collectors.groupingBy(Contact::getCity));
    }

    public Map<String, List<Contact>> getContactsByState() {
        return contacts.stream().collect(Collectors.groupingBy(Contact::getState));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address Book: ").append(name).append("\n");
        for (Contact contact : contacts) {
            sb.append(contact).append("\n");
        }
        return sb.toString();
    }
}

