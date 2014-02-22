# It is a well-researched fact that men in a rest room generally prefer to maximize
# their distance from already occupied stalls, by occupying the middle of the longest
# sequence of unoccupied places.
# For example, consider the situation where ten stalls are empty.
#     _ _ _ _ _ _ _ _ _ _
# The first visitor will occupy a middle position:
#     _ _ _ _ _ X _ _ _ _
# The next visitor will be in the middle of the empty area at the left.
#     _ _ X _ _ X _ _ _ _
# Write a program that reads the number of stalls and then prints out diagrams in the
# format given above when the stalls become filled, one at a time. Hint: Use a list of
# Boolean values to indicate whether a stall is occupied.


# FUNCTIONS
def generate_N_stalls(number, list):
    for i in range(number):
        list.append("-")

    return list

def occupyStall(list):
    lenList = len(list)
    middle = len(list) // 2

    for i in range(middle, -1, -1):
        if list[i] != "X":
            # occupy
            list[i] = "X"
            break

        else: # occupy half of length till occupied X
            if list[i // 2] != "X":
                list[i // 2] = "X"
                break

    return print(list)

# main
def main():
    exampleToilet = []

    inputN_stalls = int(input("How many stalls do you want your toilet to have: "))
    exampleToilet = generate_N_stalls(inputN_stalls, exampleToilet)
    print("Your amazing, but empty toilet")
    print(exampleToilet)

    print("Occupy 2 stalls")
    occupyStall(exampleToilet)
    occupyStall(exampleToilet)

# PROGRAM RUN
main()