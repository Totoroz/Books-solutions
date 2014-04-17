# Unit tests for P10_24.py


# IMPORTS
from glob import glob
from os import remove
from P10_22 import Appointment
from P10_24 import AppointmentBook
from nose.tools import eq_, ok_, raises


class TestAppointmentBook():
    def setup(self):
        self.apb = AppointmentBook()
        self.filename = "appointments_{}".format(self.apb._get_current_date())

    def test_get_number_of_appointments(self):
        eq_(0, self.apb.get_number_of_appointments())

    def test_create_appointment(self):
        app = self.apb.create_appointment("Coding therapy", "2014-04-16")
        ok_(isinstance(app, Appointment))

    def test_add_appointment(self):
        app = self.apb.create_appointment("Coding therapy", "2014-04-16")
        self.apb.add_appointment(app)
        eq_(1, self.apb.get_number_of_appointments())

    @raises(IndexError)
    def test_remove_non_existing_appointment(self):
        self.apb.remove_appointment(0)

    def test_remove_existing_appointment(self):
        app = self.apb.create_appointment("Coding therapy", "2014-04-16")
        self.apb.add_appointment(app)
        self.apb.remove_appointment(1)

    def test_list_appointments(self):
        app = self.apb.create_appointment("Coding therapy", "2014-04-16")
        self.apb.add_appointment(app)
        eq_("[1] 2014-04-16 - Coding therapy", self.apb.list_appointments())

    def test_get_current_date(self):
        # test will fail for date different than 2014-04-16 #usefultest
        eq_("2014-04-16", self.apb._get_current_date())

    def test_write_to_file(self):
        self.apb._write_to_file("123")
        eq_(1, len(glob(self.filename)))

    def test_get_file_contents(self):
        eq_(["123"], self.apb._get_file_contents(self.filename))
        remove(self.filename)

    def test_prepare_for_save(self):
        app = self.apb.create_appointment("Coding therapy", "2014-04-16")
        self.apb.add_appointment(app)
        eq_("2014-04-16 - Coding therapy", self.apb._prepare_for_save())

    def test_save(self):
        app = self.apb.create_appointment("Coding therapy", "2014-04-16")
        self.apb.add_appointment(app)
        self.apb.save()
        eq_(["2014-04-16 - Coding therapy"], self.apb._get_file_contents(self.filename))
        remove(self.filename)

    def test_load(self):
        app = self.apb.create_appointment("Coding therapy", "2014-04-16")
        self.apb.add_appointment(app)
        self.apb.save()
        self.apb.load()
        eq_(1, self.apb.get_number_of_appointments())
        remove(self.filename)

    @raises(IOError)
    def test_load_non_existing_file(self):
        remove(self.filename)
        self.apb.load()
