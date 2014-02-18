# Write a function
# 	def countVowels(string)
# that returns a count of all vowels in the string  string . Vowels are the letters a, e, i, o,
# and u, and their upper case variants.

# FUNCTIONS
def countVowels(string):
	numVowels = 0
	vowels = ("a", "e", "i", "o", "u", "A", "E", "I", "O", "U")

	for i in range(len(string)):
		if string[i] in vowels:
			numVowels += 1

	return numVowels

def main():
	string = str(input("Enter a string: "))

	print("Vowels: ", countVowels(string))

# PROGRAM RUN
main()