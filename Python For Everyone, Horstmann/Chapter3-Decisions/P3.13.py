# Write a program that translates a number between 0 and 4 into the closest letter
# grade. For example, the number 2.8 (which might have been the average of several
# grades) would be converted to B–. Break ties in favor of the better grade; for exam ple
# 2.85 should be a B.

gradeInput = float(input("Enter your grade: "))

gradeOutput = ""

if gradeInput > 4 or gradeInput < 0:
    exit("Invalid grade input. Grades are between 4.0 and 0.0")

if gradeInput == 4 or gradeInput >= 3.85:
    gradeOutput = "A"

elif gradeInput < 3.85 and gradeInput >= 3.7:
    gradeOutput = "A-"

elif gradeInput == 3.3 or gradeInput > 3:
    gradeOutput = "B+"

elif gradeInput == 3 or gradeInput >= 2.85:
    gradeOutput = "B"

elif gradeInput < 2.85 and gradeInput >= 2.7:
    gradeOutput = "B-"

elif gradeInput == 2.3 and gradeInput > 2:
    gradeOutput = "C+"

elif gradeInput == 2 or gradeInput >= 1.85:
    gradeOutput = "C"

elif gradeInput < 1.85 and gradeInput >= 1.7:
    gradeOutput = "C-"

elif gradeInput == 1.3 and gradeInput > 1:
    gradeOutput = "D+"

elif gradeInput == 1 or gradeInput >= 0.85:
    gradeOutput = "D"

elif gradeInput < 0.85 and gradeInput >= 0.7:
    gradeOutput = "D-"

else:
    gradeOutput = "F"

print("Your grade is:", gradeOutput)