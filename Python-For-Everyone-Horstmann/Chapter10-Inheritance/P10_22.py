# Implement a superclass Appointment and subclasses Onetime , Daily , and Monthly.
# An appointment has a description (for example, “see the dentist”) and a date.
# Write a method occursOn(year, month, day) that checks whether the appointment occurs on
# that date. For example, for a monthly appointment, you must check whether the day of the
# month matches. Then fill a list of Appointment objects with a mixture of appointments.
# Have the user enter a date and print out all appointments that occur on that date.


# IMPORTS
from datetime import datetime


class Appointment():
    def __init__(self, description, date):
        self._description = description
        self._date = date

    def create_datetime(self, date):
        return datetime.strptime(date, "%Y-%m-%d").date()

    def get_description(self):
        return self._description

    def get_date(self):
        return self._date

    def occurs_on(self, year, month, day):
        date = "{}-{}-{}".format(year, month, day)
        return self.create_datetime(self._date) == self.create_datetime(date)


class AppointmentBook():
    def __init__(self):
        self._appointments = []

    def add_appointment(self, appointment_object):
        self._appointments.append(appointment_object)

    def remove_appointment(self, appointment_id):
        self._appointments.pop(appointment_id-1)

    def get_number_of_appointments(self):
        return len(self._appointments)

    def list_appointments(self):
        output = []
        for i, appointment in enumerate(self._appointments):
            output.append("[{}] {} - {}".format(i+1, appointment.get_date(), appointment.get_description()))
        return "\n".join(output)
