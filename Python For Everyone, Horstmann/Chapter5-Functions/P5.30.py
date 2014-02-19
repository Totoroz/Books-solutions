# Having a secure password is a very important practice, when much of our informa-
# tion is stored online. Write a program that validates a new password, following these
# rules:
#     • The password must be at least 8 characters long.
#     • The password must have at least one uppercase and one lowercase letter.
#     • The password must have at least one digit.
# Write a program that asks for a password, then asks again to confirm it. If the
# passwords don’t match or the rules are not fulfilled, prompt again. Your program
# should include a function that checks whether a password is valid.

# FUNCTIONS
def validPassword(password):
    has8chars = False
    hasDigit = False
    hasUpper = False
    hasLower = False

    if len(password) >= 8:
        has8chars = True

    lowerCharacters = "abcdefghijklmnopqrstuvwxyz"
    upperCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    digits = "0123456789"

    for i in range(len(password)):
        if password[i] in lowerCharacters and hasLower != True:
            hasLower = True

        elif password[i] in upperCharacters and hasUpper != True:
            hasUpper = True

        elif password[i] in digits and hasDigit != True:
            hasDigit = True

    if has8chars  == True and hasDigit == True and hasUpper == True and hasLower == True:
        return True

    else:
        return False

# not really needed
def passwordsMatch(password, confirmPassword):
    if password == confirmPassword:
        return True

    else:
        return False

# main
def main():
    inputPassword = str(input("Enter a password: "))
    inputConfirmPassword = str(input("Confirm the password: "))
    if passwordsMatch(inputPassword, inputConfirmPassword) == True and validPassword(inputPassword) == True:
        print("Valid password")

    else:
        print("Invalid password.")

# PROGRAM RUN
main()