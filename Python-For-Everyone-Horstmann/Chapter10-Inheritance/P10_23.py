# Improve the appointment book program of Exercise P10.22. Give the user the
# option to add new appointments. The user must specify the type of the appointment,
# the description, and the date.


# IMPORTS
from P10_22 import Appointment


class AppointmentBook():
    def __init__(self):
        self._appointments = []

    def create_appointment(self):
        description = input("description>")
        date = input("date(yyyy-mm-dd)>")
        return Appointment(description, date)

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