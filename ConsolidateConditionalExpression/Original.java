package ConsolidateConditionalExpression;

class Payout {
    public int seniority;
    public int monthsDisabled;
    public boolean isPartTime;

    public double disabilityAmount() {
        if(seniority < 2) {
            return 0;
        }

        if(monthsDisabled > 12) {
            return 0;
        }

        if(isPartTime) {
            return 0;
        }

        // Compute disability amount
        return 1;
    }

    public double vacationAmount() {
        if(onVacation()) {
            if(lengthOfService() > 10) {
                return 1;
            }
        }
        return 0.5;
    }
}
