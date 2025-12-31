package ChangeReferenceToValue;

import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;

/*
What I did

Not sure what to do here

My original thought is that remove customer "name" thing

oh yeah thats probably correct
*/

class Customer {
    private String name;
    private Date birthDate;

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Customer(String name) {
        this.name = name;
    }
}

Customer john = new Customer("John Smith");
john.setBirthDate(new Date(1985, 1, 1));