# Write a program that computes and displays the perimeter of a letter­size (8.5 × 11
# inch) sheet of paper and the length of its diagonal.

from math import sqrt

paper_width_inches = 8.5
paper_length_inches = 11.0

circumference = (2 * paper_width_inches) + (2 * paper_length_inches)

diagonal = sqrt((paper_width_inches * paper_width_inches) + (paper_length_inches * paper_length_inches))

print("The circumference is %.4f inches " % circumference)
print("The diagonal is %.4f inches" % diagonal)