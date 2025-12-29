package MoveField;

/*
Different AccountType's have different interest rates
*/

class Account {
    // ...
    private AccountType type;
    private double interestRate;

    public double interestForAmount_days(double amount, int days) {
        return type.getInterestRate() * amount * days / 365.0;
    }

    public double interestForBigFamily(double familySize) {
        return getInterestRate() / familySize;
    }

    private double getInterestRate() {
        return interestRate;
    }

    private void setInterestRate(double arg) {
        interestRate = arg;
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