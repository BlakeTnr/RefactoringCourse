package ReplaceDataValueWithObject;

import java.util.Collection;
import java.util.Iterator;

class Order {
    // ...
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}

private static int numberOfOrdersFor(Collection<E> orders, String customer) {
    int result = 0;
    Iterator iter = orders.iterator();
    while(iter.hasNext()) {
        Order each = (Order) iter.next();
        if(each.getCustomer().equals(customer)) {
            result++;
        }
    }
    return result;
}