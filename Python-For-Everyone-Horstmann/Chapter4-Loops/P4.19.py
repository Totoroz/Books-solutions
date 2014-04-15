# Modify the  examaverages.py program from Worked Example 4.1 so it will also
# compute the overall average exam grade.

# Obtain the number of exam grades per student.
numExams = int(input("How many exam grades does each student have? "))

# Initialize moreGrades to a non-sentinel value.
moreGrades = "Y"
overallSum = 0.0
overallCount = 0
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
   overallCount += 1
   overallSum += average
   # Prompt as to whether the user wants to enter grades for another student.
   moreGrades = input("Enter exam grades for another student (Y/N)? ")
   moreGrades = moreGrades.upper()

overallTotal = overallSum / overallCount
print("Overall total average exam grade:", overallTotal)