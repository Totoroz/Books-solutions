# Write a program that reads in three strings and sorts them lexicographically.
#     Enter a string: Charlie
#     Enter a string: Able
#     Enter a string: Baker
#     Able
#     Baker
#     Charlie

string1 = str(input("Enter a string: "))
string2 = str(input("Enter a string: "))
string3 = str(input("Enter a string: "))

if string1 < string2 and string1 < string3:
    print(string1)

    if string2 < string3:
        print(string2)
        print(string3)

    else:
        print(string3)
        print(string2)

elif string1 > string2 and string2 < string3:
    print(string2)

    if string1 < string3:
        print(string1)
        print(string3)

    else:
        print(string3)
        print(string1)

else:
    print(string3)

    if string1 < string2:
        print(string1)
        print(string2)

    else:
        print(string2)
        print(string1)