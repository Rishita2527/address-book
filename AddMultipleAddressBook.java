package com.bridgelabz.addressbooksystem;
import java.util.Scanner;

public class AddMultipleAddressBook {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        System.out.println("Enter Number of Address Book to Add");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
        	AddMultipleAddressBook addressBook = new AddMultipleAddressBook();
            addressBook.mainMenu();
        }
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
                    ", \nphoneNo=" + phoneNo +'\''  ;
        }
    }

    public void mainMenu() {

        boolean b = true;
        while (b) {
            System.out.println(" Press 1 to Add Contact \n Press 2 to Edit Contact(Add Contact First)");
            System.out.println(" Press 3 to Delete Contact(Add Contact First) \n Press 4 to Add Multiple Contact \n Press 5 to Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    addMultipleContact();
                case 5:
                    b = false;
                    System.out.println("Thanks for Using Address book");
                    break;
                default:
                    System.out.println("Invalid Option....!!..Enter Again..");
                    break;
            }
        }
    }

    public void addContact() {
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
        System.out.println("Enter the first name of person to edit contact");
        String editName = scanner.nextLine();
        if (editName.equals(contact.getFirstName())) {
            addContact();
        } else {
            System.out.println("Invalid Name...!!...Please Enter Valid First Name");
            editContact();
        }
    }

    public void deleteContact() {
        System.out.println("Enter the first name of person to delete contact");
        String editName = scanner.nextLine();
        if (editName.equals(contact.getFirstName())) {
            System.out.println("Deleted " + contact.getFirstName() + " Contact Successfully");
            contact = null;
        }
    }

    public void addMultipleContact() {
        System.out.println("Enter Number of Contact to Add");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            addContact();
        }
    }
}
