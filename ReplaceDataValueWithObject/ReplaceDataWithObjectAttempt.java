package ReplaceDataValueWithObject;

import java.util.Collection;
import java.util.Iterator;

/*
What I did

I extracted the class Customer,

moved the function numberOfOrders into customer

moved isForCustomer check to order because of tell-dont-ask


*/

/*
What solution did differently

Just used delegation for getCustomer, thus wasn't able to
and didn't extract the isForCustomer check

I argue my refactoring is actually cleaner
*/

class Order {
    // ...
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isForCustomer(Customer customer) {
        return this.customer.equals(customer);
    }
}

class Customer {
    private String customer;
    
    public Customer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int numberOfOrders(Collection<Order> orders) {
        int result = 0;
        Iterator iter = orders.iterator();
        while(iter.hasNext()) {
            Order each = (Order) iter.next();
            if(each.isForCustomer(this)) {
                result++;
            }
        }
        return result;
    }
}