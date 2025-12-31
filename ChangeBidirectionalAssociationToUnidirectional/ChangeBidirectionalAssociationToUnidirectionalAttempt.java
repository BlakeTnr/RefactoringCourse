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

    double getDiscountedPrice() {
        return getGrossPrice() * (1 - getCustomer().getDiscount());
    }
}

class Customer {
    // ...
    private Set orders = new HashSet<>();
    
    // Should be used in Order class only.
    Set friendOrders() {
        return orders;
    }

    void addOrder(Order arg) {
        arg.setCustomer(this);
    }

    double getPriceFor(Order order) {
        Assert.isTrue(order.contains(order));
        return order.getDiscountedPrice();
    }
}