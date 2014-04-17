# Improve the appointment book program of Exercise P10.22 and P10.23 by letting
# the user save the appointment data to a file and reload the data from a file. The saving
# part is straightforward: Make a method save . Save the type, description, and date to
# a file. The loading part is not so easy. First determine the type of the appointment to
# be loaded, create an object of that type, and then call a load method to load the data.


# IMPORTS
from datetime import datetime
from P10_22 import Appointment


class AppointmentBook():
    def __init__(self):
        self._appointments = []

    def create_appointment(self, description, date):
        # belongs to a higher level interface
        # description = input("description>")
        # date = input("date(yyyy-mm-dd)>")
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

    def _get_current_date(self):
        return datetime.now().strftime("%Y-%m-%d")

    def _write_to_file(self, text):
        filename = "appointments_{}".format(self._get_current_date())
        opened_file = open(filename, "w")
        opened_file.write(text)
        opened_file.close()

    def _prepare_for_save(self):
        output = []
        for appointment_object in self._appointments:
            output.append("{} - {}".format(appointment_object.get_date(), appointment_object.get_description()))
        return "\n".join(output)

    def save(self):
        self._write_to_file(self._prepare_for_save())
        self._appointments = []

    def _get_file_contents(self, name):
        opened_file = open(name, "r")
        contents = opened_file.readlines()
        opened_file.close()
        return contents

    def _load(self, name):
        for line in self._get_file_contents(name):
            print(line)
            line = line.split("-")
            print(line)
            date = "{}-{}-{}".format(line[0], line[1], line[2].strip())
            app = Appointment(line[3].strip(), date)
            self.add_appointment(app)

    def load(self):
        try:
            self._load("appointments_{}".format(self._get_current_date()))
        except IOError:
            return False
