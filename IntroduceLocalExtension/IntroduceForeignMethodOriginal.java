package IntroduceLocalExtension;

import java.util.Date;

/*
What I missed

making it public static

This location sucks though in my opinion but I know Robert C. Martin's Clean Code
does have something about utility classes in it
*/

class Account {
    Date previousDate;
    
    double schedulePayment() {
        Date paymentDate = getNextDate(previousDate);

        // Issue a payment using paymentDate.
        // ...
    }

    public static Date getNextDate(Date previousDate) {
        return new Date(previousDate.getYear(), previousDate.getMonth(), previousDate.getDate() + 7)
    }
}
