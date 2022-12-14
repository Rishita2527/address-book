package com.bridgelabz.addressbooksystem;
import java.util.Scanner;

public class CreateContact {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        CreateContact ab = new CreateContact();
        ab.setContacts();
        ab.printContacts();
    }

    String firstName;
    String lastName;
    String emailId;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;

    public void setContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name : ");
        firstName = sc.nextLine();
        System.out.println("Enter lastname : ");
        lastName = sc.nextLine();
        System.out.println("Enter address : ");
        address = sc.nextLine();
        System.out.println("Enter your city : ");
        city = sc.nextLine();
        System.out.println("Enter State : ");
        state = sc.nextLine();
        System.out.println("Enter zip : ");
        state = sc.nextLine();
        System.out.println("Enter Phone Number : ");
        phoneNumber = sc.nextLine();
        System.out.println("Enter email : ");
        emailId = sc.nextLine();

    }

    public void printContacts() {
        System.out.println("firstname : " + firstName);
        System.out.println("LastName : " + lastName);
        System.out.println("EmailId : " + emailId);
        System.out.println("Address :" + address);
        System.out.println("City :" + city);
        System.out.println("State :" + state);
        System.out.println("Zip Code :" + zip);
        System.out.println("Phone number :" + phoneNumber);
    }
}
