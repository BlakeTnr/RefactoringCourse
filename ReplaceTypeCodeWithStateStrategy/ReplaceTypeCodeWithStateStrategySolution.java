package ReplaceTypeCodeWithStateStrategy;

/*
What the solution did

Almost the same as my attempt

extracted out the payamount method into an abstract class

It created a factory methopd, not exactly sure why

Maybe still for supporting type codes


*/

class Employee {
    // ...

    private EmployeeType type;

    public Employee(EmployeeType arg) {
        type = arg;
    }

    public int getTypeCode() {
        return type.getTypeCode();
    }

    public void setTypeCode(int arg) {
        type = EmployeeType.newType(arg);
    }

    public int monthlySalary;
    public int commission;
    public int bonus;

    public int payAmount() {
        return type.payAmount(this);
    }
}

abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract public int getTypeCode();
    
    // Factory method
    public static EmployeeType newType(int code) {
        switch(code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }

    abstract public int payAmount(Employee employee);
}

class Engineer extends EmployeeType {
    public Engineer() {

    }

    @Override public int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    @Override public int payAmount(Employee employee) {
        return employee.monthlySalary;
    }
}

class Salesman extends EmployeeType {
    public Salesman() {

    }

    @Override public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    @Override public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.commission;
    }
}

class Manager extends EmployeeType {
    public Manager() {
        
    }

    @Override public int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.bonus;
    }
}