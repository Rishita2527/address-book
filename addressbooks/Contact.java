package com.bridgelabz.addressbooks;
public class Contact {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getfirstName() {
        return firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getlastName() {
        return lastName;
    }

    public void setcity(String city) {
        this.city = city;
    }
    public String getcity() {
        return city;
    }

    public void setstate(String state) {
        this.state = state;
    }
    public String getstate() {
        return state;
    }

    public void setzip(String zip) {
        this.zip = zip;
    }
    public String getzip() {
        return zip;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setemail(String email) {
        this.email = email;
    }
    public String getemail() {
        return email;
    }

    @Override
    public String toString() {
        return '\n'+"Contact is"+'\n'+ "First Name: " + firstName +'\n'+ "Last  Name: " + lastName +'\n'+ "City : " + city +'\n'+ "State : " + state
                + "\nzip : " + zip +'\n'+"Phone Number : " + phoneNumber +'\n'+ "Email Id: " + email +'\n';
    }
}
