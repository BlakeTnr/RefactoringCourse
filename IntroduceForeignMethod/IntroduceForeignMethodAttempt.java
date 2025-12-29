package IntroduceForeignMethod;

import java.util.Date;

class Account {
    Date previousDate;
    
    double schedulePayment() {
        Date paymentDate = getNextDate(previousDate);

        // Issue a payment using paymentDate.
        // ...
    }

    private Date getNextDate(Date previousDate) {
        return new Date(previousDate.getYear(), previousDate.getMonth(), previousDate.getDate() + 7)
    }
}
