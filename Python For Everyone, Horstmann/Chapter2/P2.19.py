# Write a program that transforms numbers  1 ,  2 ,  3 , …,  12
# into the corresponding month names  January ,  February ,
# March , …,  December . Hint: Make a very long string  "January
# February March ..." , in which you add spaces such that
# each month name has the same length. Then concatenate
# the characters of the month that you want. If you are
# bothered by the trailing spaces, use the  strip method to
# remove them.

userInput = int(input("Enter the month's number: "))

# longest month name is 9 characters, make the space between every month 9 characters,
# including months' names
months = "January  February March    April    May      June     July     August   September" \
         "October  November December "

# start from (userInput - 1 (so we get correct months) * 9) and end 9 characters after that
print("Month's name: %s" % months[(userInput-1) * 9:((userInput-1) * 9) + 9])