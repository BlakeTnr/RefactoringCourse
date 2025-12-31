package ChangeReferenceToValue;

import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;

/*
What the solution did

It make the class immutable, I think this is
to prevent people from treating it like it does
have reference values when these can't really
be set because there are many instances

it also defined the equals override, which
isn't really apart of this refactoring method
but is still a good touch
*/

class Customer {
    private String name;
    private Date birthDate;

    @Override
    public bolean equals(Object arg) {
        if(!(arg instanceof Customer)) {
            return false;
        }

        Customer other = (Customer) arg;
        return (name.equals(other.name) && birthDate.compareTo(other.birthDate) == 0);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public Customer(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}

Customer john = new Customer("John Smith", new Date(1985, 1, 1));