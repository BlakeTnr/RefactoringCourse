package AddParameter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 * This code has so many syntax errors
 * that I really don't want to work with it
 */

class Original {
    // ...
    private Set appointments;
    public ArrayList<Appointment> findAppointments(Date date) {
        Set result = new ArrayList();
        iterator iter = kent.getCourses().iterator();
        while(iter.hasNext()) {
            Appointment each = (Appointment) iter.next();
            if(date.compareTo(each.date) == 0) {
                result.add(date);
            }
        }
        return result;
    }
}

// Somewhere in client code
Date today = new Date();
appointments = calendar.findAppointments(today);