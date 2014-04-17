# Unit tests for is_substring_palindrome.py


# IMPORTS
from is_substring_palindrome import is_palindrome
from nose.tools import eq_


class TestSubStringPalindrome():
    def test_word_nono(self):
        eq_(False, is_palindrome("nono"))

    def test_word_madam(self):
        eq_(True, is_palindrome("madam"))

    def test_sentence_madam(self):
        eq_(True, is_palindrome("Madam, I’m Adam"))

    def test_sentence_panama(self):
        eq_(True, is_palindrome("A man, a plan, a canal—Panama!"))

    def test_sentence_salami(self):
        eq_(True, is_palindrome("Go hang a salami, I’m a lasagna hog"))