# Write a program that reads four integers and prints “two pairs” if the input consists
# of two matching pairs (in some order) and “not two pairs” otherwise. For example,
#     1 2 2 1 two pairs
#     1 2 2 3 not two pairs
#     2 2 2 2 two pairs

number1 = int(input("Enter number one: "))
number2 = int(input("Enter number two: "))
number3 = int(input("Enter number three: "))
number4 = int(input("Enter number four: "))

if number1 == number4 and number2 == number3:
    print("Two pairs")

elif number1 == number2 and number3 == number4:
    print("Two pairs")

elif number1 == number2 and number1 == number3 and number1 == number4:
    print("Two pairs")

else:
    print("Not two pairs")