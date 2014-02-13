# Write a program that translates a letter grade into a number grade. Letter grades are
# A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and
# 0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3.
# However, an A+ has value 4.0.
#     Enter a letter grade: B-
#     The numeric value is 2.7.

from sys import exit

grade = str(input("Enter your grade: "))

score = 0

if grade[0] == "A":
    score = 4.0

elif grade[0] == "B":
    score = 3.0

elif grade[0] == "C":
    score = 2.0

elif grade[0] == "D":
    score = 1.0

else:
    exit("Unknown grade. Exiting...")

if len(grade) == 2:
    if grade[1] == "+"  and (grade[0] != "A" and grade[0] != "F"):
        score += 0.3

    elif grade[1] == "-" and grade[0] != "F":
        score -= 0.3

elif len(grade) > 2:
    exit("Invalid grade. Exiting...")

print("Your score is:", score)