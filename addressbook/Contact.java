package com.bridgelabz.addressbook;
public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    public Contact(String firstName, String lastName, String address, String city, String state, 
    		String zip, String phone, String email) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.address = address;
    	this.city = city;
    	this.state = state;
    	this.zip = zip;
    	this.phoneNumber = phone;
    	this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Contact))
            return false;

        Contact other = (Contact) obj;
        if (!(firstName.equalsIgnoreCase(other.getFirstName())))
            return false;
        if (!(lastName.equalsIgnoreCase(other.getLastName())))
            return false;
        if (!(address.equalsIgnoreCase(other.getAddress())))
            return false;
        if (!(city.equalsIgnoreCase(other.getCity())))
            return false;
        if (!state.equalsIgnoreCase(other.getState()))
            return false;
        if (!zip.equals(other.getZip()))
            return false;
        if (!(phoneNumber.equals(other.getPhone())))
            return false;
        return email.equals(other.getEmail());
    }
    @Override
    public String toString() {
        return firstName + "\t" + lastName + "\t" + address + "\t" + city + "\t" + state + "\t" + zip + "\t" + phoneNumber + "\t"
                + email;
    }
}