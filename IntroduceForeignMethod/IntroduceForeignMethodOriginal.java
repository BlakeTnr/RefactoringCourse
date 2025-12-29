package IntroduceForeignMethod;

import java.util.Date;

class Account {
    Date previousDate;
    
    double schedulePayment() {
        Date paymentDate = new Date(previousDate.getYear(), previousDate.getMonth(), previousDate.getDate() + 7);

        // Issue a payment using paymentDate.
        // ...
    }
}
