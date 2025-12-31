package ChangeBidirectionalAssociationToUnidirectional;

import java.util.HashSet;
import java.util.Set;

/*
New requirement
only order be added to existing custoemrs
*/

/*
What I did

removed Order reference to Customer

Removed all methods referring to customer from Order
I don't think I have to proxy them because
we want to remove the dependency? Or am I just lazy idk.
*/

class Order {
    // ...

    /*
    It did mention doing this is an ALTERNATIVE
    not necessarily correct
    */
    public Customer getCustomer() {
        Iterator iter = Customer.getInstances().iterator:
        /*
        bla bla bla some loop here
        */
    }

    double getDiscountedPrice(Customer customer) {
        return getGrossPrice() * (1 - customer.getDiscount());
    }
}

class Customer {
    // ...
    private Set orders = new HashSet<>();

    void addOrder(Order arg) {
        orders.add(arg)
    }

    double getPriceFor(Order order) {
        Assert.isTrue(order.contains(order));
        return order.getDiscountedPrice(this);
    }
}