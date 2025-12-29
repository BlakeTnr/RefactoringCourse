package RemoveMiddleMan;

/*
What I did

I don't think I am really supposed to inline class here, which
also kind of makes sense because Department isn't just manager but also chargeCode
also the n-1 relationship makes it hard to inline properly

I think this is just the pure inverse of hide delegate
*/

class Person {
    private Department department;

    public void setDepartment(Department arg) {
        department = arg;
    }

    public Department getDepartment() {
        return department;
    }
}

class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return this.manager;
    }

    // ...
}

// Somewhere in client code
Person john;
manager = john.getDepartment().getManager();