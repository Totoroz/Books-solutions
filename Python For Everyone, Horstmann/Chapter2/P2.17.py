# Write a program that reads two times in military format (0900, 1730) and prints the
# number of hours and minutes between the two times. Here is a sample run. User
# input is in color.
# Please enter the first time: 0900
# Please enter the second time: 1730
# 8 hours 30 minutes
# Extra credit if you can deal with the case where the first time is later than the second:
# Please enter the first time: 1730
# Please enter the second time: 0900
# 15 hours 30 minutes

time1 = int(input("Please enter the first time: "))
time2 = int(input("Please enter the second time: "))

hours1 = int(time1 / 100)
minutes1 = int((time1 % 100) + (hours1 * 60))

hours2 = int(time2 / 100)
minutes2 = int((time2 % 100) + (hours2 * 60))


difference = int((minutes2 - minutes1 + 1440) % 1440)

hours3 = int(difference / 60)
minutes3 = int(difference % 60)

print("The difference is %d hours and %d minutes" % (hours3, minutes3))