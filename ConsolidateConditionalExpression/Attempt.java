package ConsolidateConditionalExpression;

/**
 * What I did
 * 
 * Extracted out condition for disability
 * 
 * Extracted out the vacation thing even though
 * I didn't really understand it
 * 
 * 
 */

class Payout {
    public int seniority;
    public int monthsDisabled;
    public boolean isPartTime;

    public double disabilityAmount() {
        if(notEligableForDisability()) {
            return 0;
        }

        // Compute disability amount
        return 1;
    }

    private boolean notEligableForDisability() {
        if(seniority < 2) {
            return true;
        }

        if(monthsDisabled > 12) {
            return true;
        }

        if(isPartTime) {
            return true;
        }

        return false;
    }

    public double vacationAmount() {
        if(getsVacationAmount()) {
            return 1;
        }
        return 0.5;
    }

    private boolean getsVacationAmount() {
        return onVacation() && lengthOfService > 10;
    }
}
