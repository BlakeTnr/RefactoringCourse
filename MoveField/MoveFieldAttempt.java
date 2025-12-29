package MoveField;

/*
Different AccountType's have different interest rates
*/

/*
My solution

I would move the method AND field because we would likely extend AccountType
for different AccountType's,

meaning if we somehow wanted to change how interest would be calculated
it would be nice to be able to override it if we wanted to

I would also proxy the method to avoid method chaining, although this
may be a case of Middleman
*/

class Account {
    // ...
    private AccountType type;

    public double interestForAmount_days(double amount, int days) {
        return type.interestForAmount_days(amount, days);
    }
}

class AccountType {
    private double interestRate;

    public double getInterestRate() {
        return this.interestRate;
    }

    public double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365.0;
    }
}