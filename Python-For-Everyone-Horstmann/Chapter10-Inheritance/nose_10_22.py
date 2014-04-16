# Unit tests for P10_22.py


# IMPORTS
from datetime import datetime
from nose.tools import ok_, eq_, raises
from P10_22 import Appointment, AppointmentBook


class TestAppointments():
    def setup(self):
        self.app = Appointment("World domination", "2014-04-01")

    def test_get_description(self):
        ok_("World domination", self.app.get_description())

    def test_get_date(self):
        ok_("2014-04-01", self.app.get_date())

    def test_create_datetime(self):
        expected = datetime.strptime("2014-04-01", "%Y-%m-%d").date()
        eq_(expected, self.app.create_datetime(self.app.get_date()))

    def test_occurs_on_false(self):
        eq_(False, self.app.occurs_on(2012, 5, 6))

    def test_occurs_on_true(self):
        eq_(True, self.app.occurs_on(2014, 4, 1))


class TestAppointmentBook():
    def setup(self):
        self.apb = AppointmentBook()
        self.app = Appointment("World domination", "2014-04-01")

    def test_get_number_of_appointments(self):
        eq_(0, self.apb.get_number_of_appointments())

    def test_list_appointments(self):
        eq_("", self.apb.list_appointments())

    def test_add_appointment(self):
        self.apb.add_appointment(self.app)
        eq_(1, self.apb.get_number_of_appointments())
        eq_("[1] 2014-04-01 - World domination", self.apb.list_appointments())

    @raises(IndexError)
    def test_remove_non_existing_appointment(self):
        self.apb.remove_appointment(5)

    def test_remove_existing_appointment(self):
        self.apb.add_appointment(self.app)
        eq_(1, self.apb.get_number_of_appointments())
        self.apb.remove_appointment(1)
        eq_(0, self.apb.get_number_of_appointments())
