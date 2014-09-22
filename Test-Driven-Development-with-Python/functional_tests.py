import unittest

from selenium import webdriver


class NewVisitorTest(unittest.TestCase):

    def setUp(self):
        self.browser = webdriver.Firefox()

    def tearDown(self):
        self.browser.quit()

    def test_can_start_a_list_and_retrieve_it_late(self):
        self.browser.get('localhost:8000')
        self.assertIn('To-Do', self.browser.title)
        self.fail('Finish the test!')



if __name__ == '__main__':
    # silences the annoying ResourceWarning
    unittest.main(warnings='ignore')
