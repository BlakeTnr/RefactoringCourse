package ChangeReferenceToValue;

import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;

class Customer {
    private final String name;
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

    private Customer(String name) {
        this.name = name;
    }

    private static Dictionary instances = new Hashtable<>();

    public static Customer get(String name) {
        Customer value = (Customer) instances.get(name);
        if(value == null) {
            value = new Customer(name);
            instances.put(name, value);
        }
        return value;
    }
}

Customer johgn = Customer.get("John Smith");
john.setBirthDate(new Date(1985, 1, 1));