package ChangeBidirectionalAssociationToUnidirectional;

import java.util.HashSet;
import java.util.Set;

class Order {
    // ...
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer arg) {
        // Remove order from old customer.
        if(customer != null) {
            customer.friendOrders().remove(this);
        }

        customer = arg;
        if(customer != null) {
            customer.friendOrders().add(this);
        }
    }

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