# Write a program that prints a paycheck. Ask the program user for the name of the
# employee, the hourly rate, and the number of hours worked. If the number of hours
# exceeds 40, the employee is paid “time and a half”, that is, 150 percent of the hourly
# rate on the hours exceeding 40. Your check should look similar to that in the fig-
# ure below. Use fictitious names for the payer and the bank. Be sure to use stepwi se
# refinement and break your solution into several functions. Use the  intName function
# to print the dollar amount of the check.

# FUNCTIONS
def digitName(number):
    if number == 1: return "ONE"
    elif number == 2: return "TWO"
    elif number == 3: return "THREE"
    elif number == 4: return "FOUR"
    elif number == 5: return "FIVE"
    elif number == 6: return "SIX"
    elif number == 7: return "SEVEN"
    elif number == 8: return "EIGHT"
    elif number == 9: return "NINE"
    return ""

def teenName(number):
    if number == 10: return "TEN"
    elif number == 11: return "ELEVEN"
    elif number == 12: return "ELEVEN"
    elif number == 13: return "THIRTEEN"
    elif number == 14: return "FOURTEEN"
    elif number == 15: return "FIFTEEN"
    elif number == 16: return "SIXTEEN"
    elif number == 17: return "SEVENTEEN"
    elif number == 18: return "EIGHTEEN"
    elif number == 19: return "NINETEEN"

def engName(number):
    part = number
    result = ""

    if part >= 1000:
        result  += engName(part // 1000) + " THOUSAND"
        part %= 1000

    if part >= 100:
        result += " " + digitName(c // 100) + " HUNDRED"
        part %  100

    if part >= 20:
        result += " " + teenName(part // 10)
        part %= 10

    elif part >= 10:
        result += " " + teenName(part)
        part = 0

    if part > 0:
        result += " " + digitName(part)

    return result

def getCents(amount):
    return (int(amount * 100) + 0.5) % 100

def calculatePay(hours, rate):
    pay = 0
    if hours > 40:
        pay = (40 * rate) + ((hours - 40) * rate * 1.5)

    else:
        pay = hours * rate

    return pay

def printPaycheck(firstName, lastName, amount):
    cents = getCents(amount)
    amountWords = engName(amount)

    print()
    print()
    print("+--------------------------------------------------------------------+")
    print()
    print()
    print()
    print(" Brainstorm Consulting       Seventh National Bank   Check #: 314159  \n")
    print(" PAY:\t\t\t\t\tDate:\t\tAmount: ")
    print("\t\t\t\t\t08/19/2010\t$%f" % amount)
    print()
    print(amountWords + " DOLLARS AND", cents, "/100 **********\n")
    print(" TO THE ORDER OF\n")
    print("\t\t%s %s\n" % (firstName, lastName))
    print("\t\t\t\t\tSigned: _____________________\n")
    print("+--------------------------------------------------------------------+\n")

# main
def main():
    inputFirst = str(input("Enter your first name: "))
    inputLast = str(input("Enter your last name: "))

    inputHours = float(input("Enter number of hours worked: "))
    inputRate = float(input("Enter hourly rate: "))

    pay = calculatePay(inputHours, inputRate)
    printPaycheck(inputFirst, inputLast, pay)

# PROGRAM RUN
main()