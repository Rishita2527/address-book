package com.bridgelabz.addressbooksys;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {
    private final ArrayList<Contact> contactList = new ArrayList<>();
    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean addContact(Contact contact) {
        List<Contact> filteredByFName = searchByName(contact.getFirstName());
        for (Contact sameName : filteredByFName)
            if (sameName.equals(contact))
                return false;
        contactList.add(contact);
        return true;
    }

    public List<Contact> searchByName(String name) {
        return contactList.stream().
                filter(person -> person.getFirstName().equalsIgnoreCase(name)).
                collect(Collectors.toList());
    }

    public List<Contact> searchByCity(String city) {
        return contactList.stream().
                filter(person -> person.getCity().equalsIgnoreCase(city)).
                collect(Collectors.toList());
    }

    public List<Contact> searchByState(String state) {
        return contactList.stream().
                filter(person -> person.getState().equalsIgnoreCase(state)).
                collect(Collectors.toList());
    }

    public boolean editContact(Contact current, Contact modified) {
        if (!contactList.contains(current))
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

        StringBuilder sBuilder = new StringBuilder();
        contactList.forEach(sBuilder::append);
        return sBuilder.toString();
    }
}