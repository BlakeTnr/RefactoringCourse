package HideDelegate;

class Person {
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department arg) {
        department = arg;
    }

    public Person getManager() {
        return department.getManager();
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
manager = john.getManager();