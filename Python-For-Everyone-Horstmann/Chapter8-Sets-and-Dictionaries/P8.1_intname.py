# Write a new version of the program intname.py
# from Chapter 5 to use a dictionary
# instead of if statements.


def main():
    value = int(input("Please enter a positive integer < 1000: "))
    print(intName(value))


def int_name(number):
    part = number   # The part that still needs to be converted.
    name = ""   # The name of the number.

    if part >= 100:
        name = digitName(part // 100) + " hundred"
        part = part % 100

    if part >= 20:
        name = name + " " + tensName(part)
        part = part % 10
    elif part >= 10:
        name = name + " " + teenName(part)
        part = 0

    if part > 0:
        name = name + " " + digitName(part)
    return name


def digit_name(digit):
    digits = {1: "one", 2: "two", 3: "three", 4: "four", 5:
              "five", 6: "six", 7: "seven", 8: "eight", 9: "nine"}
    return digits[digit]


def teen_name(number):
    numbers = {
        10: "ten", 11: "eleven", 12: "twelve", 13: "thirteen", 14: "fourteen",
        15: "fifteen", 16: "sixteen", 17: "seventeen", 18: "eighteen", 19: "nineteen"}
    return numbers[number]


def tens_name(number):
    numbers = {90: "ninety", 80: "eighty", 70: "seventy", 60:
               "sixty", 50: "fifty", 40: "forty", 30: "thirty", 20: "twenty"}
    return numbers[number]


# Start the program.
if __name__ == '__main__':
    main()
pp