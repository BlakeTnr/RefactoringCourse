package ReplaceDelegationWithInhertiance;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return name.substring(name.lastIndexOf(' ') + 1);
    }
}

class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    @Override public String toString() {
        return "Emp: " + getLastName();
    }
}