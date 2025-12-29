package MoveMethod;
/*
The problem states that we will have many different account types

each with different ways of calculating overdraft charge.
*/

class Account {
    // ...
    private AccountType type;
    private int daysOverdrawn;

    public double overdraftCharge() {
        if(type.isPremium()) {
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

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }
}

class AccountType {

    public boolean isPremium() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPremium'");
    }
    // ...
}