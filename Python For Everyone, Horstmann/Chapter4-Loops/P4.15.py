# The Fibonacci numbers.
# Reformulate that as
#     fold1 = 1
#     fold2 = 1
#     fnew = fold1 + fold2
# After that, discard  fold2 , which is no longer needed, and set  fold2 to  fold1 and  fold1 to
# fnew . Repeat an appropriate number of times.
# Implement a program that prompts the user for an integer n and prints the nth
# Fibonacci number, using the above algorithm.

inputN = int(input("Enter an integer: "))

fold1 = 0
fold2 = 0
fnew = 1

while fnew <= inputN:
    print(fnew)
    fold2 = fold1
    fold1 = fnew
    fnew = fold1 + fold2
