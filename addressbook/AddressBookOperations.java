package com.bridgelabz.addressbook;
import java.util.*;

public class AddressBookOperations {
    private static Contact readContact(Scanner scan) {
        System.out.println("First Name: ");
        String firstName = scan.nextLine();
        System.out.println("Last Name: ");
        String lastName = scan.nextLine();
        System.out.println("Address: ");
        String address = scan.nextLine();
        System.out.println("City: ");
        String city = scan.nextLine();
        System.out.println("State: ");
        String state = scan.nextLine();
        System.out.println("Zip: ");
        String zip = scan.nextLine();
        System.out.println("Phone Number: ");
        String phone = scan.nextLine();
        System.out.println("Email Address: ");
        String email = scan.nextLine();

        return new Contact(firstName, lastName, address, city, state, zip, phone, email);
    }

    private static void addressBookOps(AddressBook book, Scanner scan) {
        while (true) {
            System.out.println("\n Welcome to Address Book Program");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Print Address Book");
            System.out.println("5. Back");
            System.out.print("Your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: //Add the contact
                    if (book.addContact(readContact(scan)))
                        System.out.println("Contact Added!");
                    else System.out.println("Contact already exists");
                    break;

                case 2: //Edit the contact
                    System.out.println("Enter name to edit: ");
                    String name = scan.nextLine();
                    List<Contact> sameName = book.searchByName(name);
                    if (sameName.isEmpty())
                        System.out.println("NOT FOUND!");
                    else if (sameName.size() == 1) {
                        book.editContact(sameName.get(0), readContact(scan));
                        System.out.println("Contact Modified!");
                    }
                    else {
                        sameName.forEach(x -> System.out.println(sameName.indexOf(x) + "  " + x.toString()));
                        System.out.println("Enter an index to edit: ");
                        int index=scan.nextInt();
                        scan.nextLine();
                        book.editContact(sameName.get(index), readContact(scan));
                        System.out.println("Contact Modified!");
                    }
                    break;

                case 3: //Delete the contact
                    System.out.println("Enter name to delete: ");
                    name = scan.nextLine();
                    sameName = book.searchByName(name);

                    if (sameName.isEmpty())
                        System.out.println("NOT FOUND!");
                    else if (sameName.size() == 1) {
                        book.deleteContact(sameName.get(0));
                        System.out.println("Contact Deleted!");
                    } else {
                        sameName.forEach(x -> System.out.println(sameName.indexOf(x) + "  " + x.toString()));
                        System.out.println("Enter an index to delete: ");
                        book.deleteContact(sameName.get(scan.nextInt()));
                        System.out.println("Contact Deleted!");
                    }
                    break;

                case 4: //Print the Contact Details
                    System.out.println(book.toString());
                    break;

                case 5: //Quit
                    return;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Dictionary<String, AddressBook> library = new Hashtable<>();
        while (true) {
            System.out.println("\n\nWelcome to Address Book Program");
            System.out.println("1. New Address Book");
            System.out.println("2. Select Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Name of new address book: ");
                    String bookName = scan.next();
                    scan.nextLine();
                    library.put(bookName, new AddressBook());
                    addressBookOps(library.get(bookName), scan);
                    break;
                case 2:
                    System.out.println("Available books are: ");
                    for (Enumeration<String> i = library.keys(); i.hasMoreElements(); ) {
                        System.out.println(i.nextElement() + ",");
                    }
                    System.out.println("Open Book: ");
                    String name = scan.nextLine();
                    System.out.println("Current: " + name);
                    addressBookOps(library.get(name), scan);
                    break;
                case 3:
                    System.out.println("Enter name to delete: ");
                    name = scan.nextLine();
                    library.remove(name);
                    break;
                case 4:
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
