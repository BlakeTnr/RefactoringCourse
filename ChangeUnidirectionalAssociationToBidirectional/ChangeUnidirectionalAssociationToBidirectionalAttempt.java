package ChangeUnidirectionalAssociationToBidirectional;

import java.util.List;

/*
What solution did

I should have refactored setCustomer to also
update the relationship in Customer

Solution used Set and returned orders

*/

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
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    // we should hide arrays
    // we could use ID but we don't have one in
    // this case
    public Order getOrder(int orderIndex) {
        return orders.get(orderIndex);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    /*
    Another thought is to extract this class
    but that would lead to message chain
    so probably not, this is probably a fine
    amount of responsability

    This is a clear cape of encapsulation

    This is refferd to as Encapsulate Collection
    I should have returned the set though
    */
}