package IntroduceLocalExtension;

import java.util.Date;

class Account {
    MyDate previousDate;
    
    double schedulePayment() {
        Date paymentDate = previousDate.getNextDate();

        // Issue a payment using paymentDate.
        // ...
    }
}

/*
Solution just includes the call to the super in the constructor and also
provding a constructor which takes the original argument in order
to convert it
*/

class MyDate extends Date {
    public Date getNextDate() {
        return new Date(this.getYear(), this.getMonth(), this.getDate() + 7);
    }
}