package MoveField;

/*
Different AccountType's have different interest rates
*/

class Account {
    // ...
    private AccountType type;
    private double interestRate;
    
    public double interestForAmount_days(double amount, int days) {
        return interestRate * amount * days / 365.0;
    }
}

class AccountType {
    
}