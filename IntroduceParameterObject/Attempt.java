package IntroduceParameterObject;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

class Account {
    // ...
    
    private Vector transactions = new Vector();
    
    public double getFlowBetween(DateRange dateRange) {
        double result = 0;
        Enumeration e = transactions.elements();
        while(e.hasMoreElements()) {
            Transaction each = (Transaction) e.nextElement();
            if(dateRange.inRange(each.getDate())) {
                result += each.getValue();
            }
        }
        return result;
    }
}

class Transaction {
    private Date chargeDate;
    private double value;

    public Transaction(double value, Date chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }
    public Date getDate() {
        return chargeDate;
    }
    public double getValue() {
        return value;
    }
}

class DateRange {
    Date startDate;
    Date endDate;

    public DateRange(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean inRange(Date date) {
        return date.compareTo(startDate) >= 0 && date.compareTo(endDate) <= 0;
    }
}

// Womewhere in client code...
Account account;
Date startDate;
Date endDate;
DateRange dateRange = new DateRange(startDate, endDate);
double flow = account.getFlowBetween(dateRange);