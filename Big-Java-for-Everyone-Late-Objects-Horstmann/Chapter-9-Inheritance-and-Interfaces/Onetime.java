import java.text.ParseException;

/*Business P9.21   Implement a superclass Appointment and subclasses Onetime , Daily , and Monthly.
 An appointment has a description (for example, “see the dentist”) and a date. 
 Write a method occursOn(int year, int month, int day) that checks whether the appointment occurs on
 that date. For example, for a monthly appointment, you must check whether the day of the month 
 matches. Then fill an array of Appoint­ment objects with a mixture of appointments.
 Have the user enter a date and print out all appointments that occur on that date.*/

public class Onetime extends Appointment {
    public Onetime(String description, int year, int month, int day) throws ParseException {
        super(description, year, month, day);
    }
}
