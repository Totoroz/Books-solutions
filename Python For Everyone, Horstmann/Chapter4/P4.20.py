# Modify the  examaverages.py program from Worked Example 4.1 to have it validate the
# input when the user is prompted as to whether they want to enter grades for another
# student.

# imports
from sys import exit

# Obtain the number of exam grades per student.
try:
    numExams = int(input("How many exam grades does each student have? "))
except ValueError:
    exit("Invalid input - num exam grades. Exiting")

# Initialize moreGrades to a non-sentinel value.
moreGrades = "Y"

# Compute average exam grades until the user wants to stop.
while moreGrades == "Y" :

   # Compute the average grade for one student.
   print("Enter the exam grades.")
   total = 0
   for i in range(1, numExams + 1) :
      score = int(input("Exam %d: " % i))   # Prompt for each exam grade.
      total = total + score

   average = total / numExams
   print("The average is %.2f" % average)

   # Prompt as to whether the user wants to enter grades for another student.
   moreGrades = input("Enter exam grades for another student (Y/N)? ")
   moreGrades = moreGrades.upper()
