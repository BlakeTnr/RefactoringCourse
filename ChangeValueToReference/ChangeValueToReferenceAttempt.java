package ChangeValueToReference;

import java.util.Collection;
import java.util.HashMap;

/*
What I did

I actually didn't know how to solve this
I want to store a hashmap of all customers and return the instance if the
one we are looking for already exists, but I can't do that
*/

class Customer {
    private final String name;
    private static HashMap<String, Customer> customers = new HashMap();

    public Customer(String name) {
        Customer cachedCustomer = customers.get(name);
        if(cachedCustomer) {
            this = cachedCustomer;
        }
        
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
        customer = new Customer(customerName);
    }

    public Order(String customerName) {
        customer = new Customer(customerName);
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