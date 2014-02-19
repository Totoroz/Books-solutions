# Write a program that prints instructions to get coffee, asking the user for input
# whenever a decision needs to be made. Decompose each task into a function, for
# example:
#     def brewCoffee() :
#         print("Add water to the coffee maker.")
#         print("Put a filter in the coffee maker.")
#         grindCoffee()
#         print("Put the coffee in the filter.")
#         . . .

# FUNCTIONS
def grindCoffee():
    choice = str(input("Grind the coffee?(Y/N) "))

    if choice == "y" or choice == "Y":
        print("Add beans to grinder")
        print("Grind up coffee beans for 2 minutes")

def brewCoffee():
    print("Switch the coffee maker on")
    print("Wait for the water to run through")

def pourCoffee():
    print("Get a mug")
    print("Pour coffee in a mug")

def drinkCoffee():
    print("Drink the coffee you just made")

# main
def main():
    print("Add water to the coffee maker")
    print("Put a filter in the coffee maker")
    grindCoffee()
    print("Put coffee in the filter")
    brewCoffee()
    pourCoffee()
    drinkCoffee()


# PROGRAM RUN
main()