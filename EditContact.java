package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class EditContact {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        EditContact addressBook = new EditContact();
        addressBook.addContact();
        addressBook.editContact();
    }
    public class Contact {
        private String firstName;
        private String lastName;
        private String city;
        private String state;
        private int zip;
        private long phoneNo;
        private String email;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        public long getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return 
                    "\nfirstName='" + firstName + '\'' +
                    ", \nlastName='" + lastName + '\'' +
                    ", \nemail='" + email + '\'' +
                    ", \ncity='" + city + '\'' +
                    ", \nstate='" + state + '\'' +
                    ", \nzip=" + zip +
                    ", \nphoneNo=" + phoneNo  ;
        }
    }

    void addContact(){
        System.out.println("First Name:- ");
        String firstName = scanner.next();
        contact.setFirstName(firstName);
        System.out.println("Last Name:- ");
        String lastName = scanner.next();
        contact.setLastName(lastName);
        System.out.println("City:- ");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("State:- ");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Email ID:- ");
        String eMail = scanner.next();
        contact.setEmail(eMail);
        System.out.println("ZIP Code:- ");
        int zip = scanner.nextInt();
        contact.setZip(zip);
        System.out.println("PhoneNo:- ");
        long phoneNo = scanner.nextLong();
        contact.setPhoneNo(phoneNo);

        System.out.println("Your Contact saved as:-");
        System.out.println(contact);
    }
    public void editContact() {
        System.out.println("Enter Y to Edit and N to Exit:- ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        if(option.equals("Y")){
            System.out.println("Enter the first name of person to edit contact");
            String editName = scanner.nextLine();
            if (editName.equals(contact.getFirstName())){
                addContact();
            }else {
                System.out.println("Invalid Name...!!...Please Enter Valid First Name");
                editContact();
            }
            System.out.println("Thanks for using Address Book");
        }
        else if (option.equals("N")){
            System.out.println("Thanks for using Address Book");
        }
        else System.out.println("Invalid.. Enter Y and N Only");
    }
}
