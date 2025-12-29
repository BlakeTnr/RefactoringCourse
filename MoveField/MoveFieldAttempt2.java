package MoveField;

/*
Different AccountType's have different interest rates
*/

/*
Self encapsulation leaves it so that future changes
are much easier if we decide to move a field
*/

class Account {
    // ...
    private AccountType type;

    public double interestForAmount_days(double amount, int days) {
        return type.getInterestRate() * amount * days / 365.0;
    }

    public double interestForBigFamily(double familySize) {
        return getInterestRate() / familySize;
    }

    private double getInterestRate() {
        return type.interestRate;
    }

    private void setInterestRate(double arg) {
        type.setInterestRate(arg);
    }
}

class AccountType {
    protected double interestRate;

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double arg) {
        interestRate = arg;
    }
}