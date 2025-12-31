package ChangeValueToReference;

import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

/*
Solution

This was similar to what I was trying to do with the hashmap,
it just privated the constructor and used a create method

in the end it changed it to a getNamed, which means
we in this case don't allow for new customers to be dynamically added, but oh well
*/

class Customer {
    private static Dictionary instances = new Hashtable();

    static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private final String name;

    public static Customer getNamed(String name) {
        return (Customer) instances.get(name);
    }

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    // ...
    private Customer customer;
    
    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        customer = Customer.getNamed(customerName);
    }

    public Order(String customerName) {
        customer = Customer.getNamed(customerName);
    }
}

// Some client code, which uses Order class.
private static int numberOfOrdersFor(Collection orders, String customer) {
    int result = 0;
    Iterator iter = orders.iterator();
    while(iter.hasNext()) {
        Order each = (Order) iter.next();
        if(each.getCustomerName().equals(customer)) {
            result++;
        }
    }
    return result;
}