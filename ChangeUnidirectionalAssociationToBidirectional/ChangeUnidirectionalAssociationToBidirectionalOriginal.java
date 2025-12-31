package ChangeUnidirectionalAssociationToBidirectional;

class Order {
    // ...

    private Customer customer;
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer arg) {
        customer = arg;
    }
}

class Customer {
    // ...
}