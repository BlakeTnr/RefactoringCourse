package ReplaceConditionalWithPolymorphism;

/**
 * What I did
 * 
 * I didn't do a factory
 * but I did make the constructor private and then
 * made the subclass call it to provide the info
 * I'm not sure what this pattern is called
 * 
 * Removed EmployeeType b.c. not needed
 */

abstract class Employee {
    // ...

    // private EmployeeType type;
    
    public int getTypeCode() {
        return type;
    }

    private int type;
    protected Employee(int type) {
        this.type = type;
    }

    public int monthlySalary;
    public int commission;
    public int bonus;
    
    abstract public int payAmount();
}

// abstract class EmployeeType {
//     static final int ENGINEER = 0;
//     static final int SALESMAN = 1;
//     static final int MANAGER = 2;
    
//     abstract public int getTypeCode();
    
//     public static EmployeeType newType(int code) {
//         switch(code) {
//             case ENGINEER:
//                 return new Engineer();
//             case SALESMAN:
//                 return new Salesman();
//             case MANAGER:
//                 return new Manager();
//             default:
//                 throw new IllegalArgumentException("Incorrect Employee Code");
//         }
//     }
// }

class Engineer extends Employee {
    public Engineer() {
        super(0);
    }

    public int payAmount() {
        // ...
        return 0;
    }
}

class Salesman extends Employee {
    public Salesman() {
        super(1);
    }

    public int payAmount() {
        // ...
        return 0;
    }
}

class Manager extends Employee {
    public Manager() {
        super(2);
    }

    public int payAmount() {
        // ...
        return 0;
    }
}