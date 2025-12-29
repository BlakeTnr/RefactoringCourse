package MoveField;

/*
Different AccountType's have different interest rates
*/

class Account {
    // ...
    private AccountType type;

    public double interestForAmount_days(double amount, int days) {
        return type.getInterestRate() * amount * days / 365.0;
    }
}

class AccountType {
    private double interestRate;

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double arg) {
        interestRate = arg;
    }
}