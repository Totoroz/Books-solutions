#  Write a program that prompts for the day and month of the user’s birthday and then
# prints a horoscope. Make up fortunes for programmers, like this:
#     Please enter your birthday.
#     month: 6
#     day: 16
#     Gemini are experts at figuring out the behavior of complicated programs.
#     You feel where bugs are coming from and then stay one step ahead. Tonight,
#     your style wins approval from a tough critic.
# Each fortune should contain the name of the astrological sign. (You will find the
# names and date ranges of the signs at a distressingly large number of sites on the
# Internet.)

month = int(input("Enter your birthday(month and day): "))
day = int(input())

sign = ""

if month == 1:
    if day <= 19:
        sign = "Capricorn"

    else:
        sign = "Aquarius"

elif month == 2:
    if day <= 18:
        sign = "Aquarius"

    else:
        sign = "Pisces"

elif month == 3:
    if day <= 20:
        sign = "Pisces"

    else:
        sign = "Aries"

elif month == 4:
    if day <= 19:
        sign = "Aries"

    else:
        sign = "Taurus"

elif month == 5:
    if day <= 20:
        sign = "Taurus"

    else:
        sign = "Gemini"

elif month == 6:
    if day <= 21:
        sign = "Gemini"

    else:
        sign = "Cancer"

elif month == 7:
    if day <= 22:
        sign = "Cancer"

    else:
        sign = "Leo"

elif month == 8:
    if day <= 22:
        sign = "Leo"

    else:
        sign = "Virgo"

elif month == 9:
    if day <= 22:
        sign = "Virgo"

    else:
        sign = "Libra"

elif month == 10:
    if day <= 23:
        sign = "Libra"

    else:
        sign = "Scorpio"

elif month == 11:
    if day <= 21:
        sign = "Scorpio"

    else:
        sign = "Sagittarius"

elif month == 12:
    if day <= 21:
        sign = "Sagittarius"

    else:
        sign = "Capricorn"

# fortunes
if sign == "Capricorn":
    print("Example Capricorn fortune.")

elif sign == "Aquarius":
    print("Example Aquarius fortune.")

elif sign == "Pisces":
    print("Example Pisces fortune.")

elif sign == "Aries":
    print("Example Aries fortune.")

elif sign == "Taurus":
    print("Example Taurus fortune.")

elif sign == "Gemini":
    print("Example Gemini fortune.")

elif sign == "Cancer":
    print("You have cancer, you don't get a fortune.")

elif sign == "Leo":
    print("Example Leo fortune")

elif sign == "Virgo":
    print("Example Virgo fortune")

elif sign == "Libra":
    print("Example Libra fortune")

elif sign == "Scorpio":
    print("Example Scorpio fortune")

else:
    print("Unknown sign. You're a special one")