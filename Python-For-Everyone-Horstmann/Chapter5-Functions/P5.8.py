# It is a well-known phenomenon that most people are easily able to read a text whose
# words have two characters flipped, provided the first and last letter of each word are
# not changed. For example,
#     I dn’ot gvie a dman for a man taht can olny sepll a wrod one way. (Mrak Taiwn)
# Write a function  scramble(word) that constructs a scrambled version of a given word,
# ran domly flipping two characters other than the first and last one. Then write a
# program that reads words and prints the scrambled words.

# IMPORTS
from random import randint

# FUNCTIONS
def scramble(word):
    result = word[0]

    if len(word) > 1:
        for i in range(len(word) - 2, 0, -1):
            result += word[i]

        result += word[len(word) - 1]

    return result


def main():
    print("I don't give a damn for a man that can only spell a word one way.")
    print("Scrambled....")
    print(scramble("I"), scramble("don't"), scramble("give"), scramble("a"), scramble("damn"), scramble("for"),
          scramble("a"), scramble("man"), scramble("that"), scramble("can"), scramble("only"), scramble("spell"),
          scramble("a"), scramble("word"), scramble("one"), scramble("way"))


# PROGRAM RUN
main()
