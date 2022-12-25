package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {
    private ArrayList<Contact> contactList = new ArrayList<>();
    public boolean addContact(Contact contact) {
        List<Contact> filteredByFName = searchByName(contact.getFirstName());
        for (Contact sameName : filteredByFName)
            if (sameName.equals(contact))
                return false;
        contactList.add(contact);
        return true;
    }

    public List<Contact> searchByName(String name){
        return contactList.stream().
                filter(person -> person.getFirstName().equalsIgnoreCase(name)).
                collect(Collectors.toList());
    }

    public boolean editContact(Contact current, Contact modified) {
        if(!contactList.contains(current))
            return false;
        contactList.remove(current);
        contactList.add(modified);
        return true;
    }

    public boolean deleteContact(Contact contact) {
        contactList.remove(contact);
        return true;
    }

    @Override
    public String toString() {
        if (contactList.isEmpty())
            return "No contacts found!";

        StringBuilder builder = new StringBuilder();
        for (Contact contacts : contactList)
            builder.append(contacts.toString()).append("\n");

        return builder.toString();
    }
}