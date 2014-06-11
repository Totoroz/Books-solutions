import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*Business P9.21   Implement a superclass Appointment and subclasses Onetime , Daily , and Monthly.
 An appointment has a description (for example, “see the dentist”) and a date. 
 Write a method occursOn(int year, int month, int day) that checks whether the appointment occurs on
 that date. For example, for a monthly appointment, you must check whether the day of the month 
 matches. Then fill an array of Appoint­ment objects with a mixture of appointments.
 Have the user enter a date and print out all appointments that occur on that date.*/

public class Appointment {
    private String description;
    private Date date;

    public Appointment(String description, int year, int month, int day) throws ParseException {
        this.description = description;
        DateFormat dateFormatter = new SimpleDateFormat(String.format("yyyy-MM-dd"));
        this.date = dateFormatter.parse(String.format("%d-%d-%d", year, month, day));
    }

    public boolean occursOn(int year, int month, int day) throws ParseException {
        DateFormat dateFormatter = new SimpleDateFormat(String.format("yyyy-MM-dd"));
        Date checkedDate = dateFormatter.parse(String.format("%d-%d-%d", year, month, day));
        return checkedDate.equals(this.date);
    }

    public void print() {
        System.out.println(String.format("Appointment: %s\nDate: %s", this.description, this.date.toString()));
    }
    
    public Date getDate() {
        return this.date;
    }
}
