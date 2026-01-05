package ReplaceTypeCodeWithStateStrategy;

/*
What I did

I did state pattern (I think)

I did composition of a "PaymentMethod"
which the Employee class delegates to in order to call the pay
amount

Implemented using abstract class, but I may have been able to
subclass a regular class and then call for example
super.payAmount() * bonus

I wanted to stick with abstract, just because it felt
more flexible rather than creating a more complex
class tree
*/

class Employee {
    // ...
    // static final int ENGINEER = 0;
    // static final int SALESMAN = 1;
    // static final int MANAGER = 2;

    private PaymentMethod paymentMethod;
    
    public int type;

    public Employee(int arg) {
        type = arg;
    }

    public int monthlySalary;
    public int commission;
    public int bonus;
    public int payAmount() {
        return paymentMethod.payAmount();
    }
}

abstract class PaymentMethod {
    public abstract int payAmount();
}

class Salaried extends PaymentMethod {
    private int monthlySalary;

    public Salaried(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int payAmount() {
        return monthlySalary;
    }
}

class SalariedCommission extends PaymentMethod {
    private int monthlySalary;
    private int commission;

    public SalariedCommission(int monthlySalary, int commission) {
        this.monthlySalary = monthlySalary;
        this.commission = commission;
    }

    public int payAmount() {
        return monthlySalary * commission;
    }
}

class SalariedBonus extends PaymentMethod {
    private int monthlySalary;
    private int bonus;

    public SalariedBonus(int monthlySalary, int bonus) {
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    public int payAmount() {
        return monthlySalary * bonus;
    }
}