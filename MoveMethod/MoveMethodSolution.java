package MoveMethod;
/*
The problem states that we will have many different account types

each with different ways of calculating overdraft charge.
*/


/*
Things I did
- moved overdraft calculation to AccountType
- passed the overdraftCharge

Things I didn't do
- I should've passed the account as the parameter to overdraftCharge
I would've known this if I needed more fields from Account
Maybe good practice not to pass primitives?

No matter what AccounType will need to know about account daysoverdrawn
*/

class Account {
    // ...
    public int daysOverdrawn;
    private AccountType type;

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += type.overdraftCharge(this);
        }
        return result;
    }
}

class AccountType {
    public double overdraftCharge(Account account) {
        if(this.isPremium()) {
            double result = 10;
            if(account.daysOverdrawn > 7) {
                result += (account.daysOverdrawn - 7) * 0.85;
            }
            return result;
        }
        else {
            return account.daysOverdrawn * 1.75;
        }
    }

    public boolean isPremium() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPremium'");
    }
    // ...
}