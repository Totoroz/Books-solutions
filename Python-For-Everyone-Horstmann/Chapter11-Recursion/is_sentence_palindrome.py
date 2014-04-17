# Checks recursively if sentence is a palindrome


def is_palindrome(sentence):
    if len(sentence) <= 1:
        return True

    first_char = sentence[0].lower()
    last_char = sentence[-1].lower()

    if first_char.isalpha() and last_char.isalpha():
        if first_char == last_char:
            shorter = sentence[1:-1]
            return is_palindrome(shorter)
        return False
    elif not last_char.isalpha():
        shorter = sentence[:-1]
        return is_palindrome(shorter)
    shorter = sentence[1:]
    return is_palindrome(shorter)
