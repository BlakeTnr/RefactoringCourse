package ReplaceTypeCodeWithSubclass;

/*
What I did

I created a Employee base class
I could have made it an abstract class

encapsulated all fields

avoided refused bequest by not making engineer for
examples have a bonus or commission

I see why some people talk about composition over inheritance
because if I wanted to create something else with
a commission I would have to reimplement the
algoirithm again
Abstract classes can't fix this,
interfaces don't
only composition, which is a little sucky but
oh well
*/

class Employee {
    private int monthlySalary;

    public Employee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int payAmount() {
        return this.getMonthlySalary();
    }
}

class Engineer extends Employee {
    public Engineer(int monthlySalary) {
        super(monthlySalary);
    }
}

class Salesman extends Employee {
    private int commission;

    public Salesman(int monthlySalary, int commission) {
        super(monthlySalary);
        this.commission = commission;
    }

    public int getCommission() {
        return this.commission;
    }

    public int payAmount() {
        return this.getMonthlySalary() + this.getCommission();
    }
}

class Manager extends Employee {
    private int bonus;

    public Manager(int monthlySalary, int bonus) {
        super(monthlySalary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public int payAmount() {
        return this.getMonthlySalary() + this.getBonus();
    }
}