# When two points in time are compared, each given as hours (in military time,
# rang ing from 0 to 23) and minutes, the following pseudocode determines which
# comes first.
#     If hour1 < hour2
#     time1 comes first.
#     Else if hour1 and hour2 are the same
#     If minute1 < minute2
#     time1 comes first.
#     Else if minute1 and minute2 are the same
#     time1 and time2 are the same.
#     Else
#     time2 comes first.
#     Else
#     time2 comes first.
# Write a program that prompts the user for two points in time and prints the time that
# comes first, then the other time.

time1 = int("Enter time: ")
time2 = int("Enter time: ")