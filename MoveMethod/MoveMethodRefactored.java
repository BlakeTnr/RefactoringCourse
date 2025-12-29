package MoveMethod;
/*
The problem states that we will have many different account types

each with different ways of calculating overdraft charge.
*/

class Account {
    // ...
    private int daysOverdrawn;
    private AccountType type;

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += type.overdraftCharge(daysOverdrawn);
        }
        return result;
    }
}

class AccountType {
    public double overdraftCharge(int daysOverdrawn) {
        if(this.isPremium()) {
            double result = 10;
            if(daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        }
        else {
            return daysOverdrawn * 1.75;
        }
    }

    public boolean isPremium() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPremium'");
    }
    // ...
}