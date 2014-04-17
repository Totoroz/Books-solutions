# Another implementation of finding if a sentence is palindrome.
# This one uses a recursive helper functionn.


# FUNCTIONS
def is_substring_palindrome(text, start, end):
    if start >= end:
        return True
    first_char = text[start].lower()
    last_char = text[end].lower()
    if first_char.isalpha() and last_char.isalpha():
        if first_char == last_char:
            return is_substring_palindrome(text, start + 1, end - 1)
        return False
    elif not last_char.isalpha():
            return is_substring_palindrome(text, start, end - 1)
    return is_substring_palindrome(text, start + 1, end)


def is_palindrome(sentence):
    return is_substring_palindrome(sentence, 0, len(sentence) - 1)
