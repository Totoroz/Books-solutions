# Given three sets, set1 , set2 , and set3 , write Python statement(s)
# to perform the following actions:
# a.   Create a new set of all elements that are in set1 or set2 , but not both.


# FUNCTIONS
def create_new_set_from_union_of_unique_elements(set_a, set_b):
    return set_a ^ set_b


def create_new_set_from_union_of_unique_elements_in_three_sets(set_a, set_b, set_c):
    return set_a.union(set_b) ^ set_b.union(set_c)


# main
def main():
    set_a = {1, 2, 3, 4}
    set_b = {2, 4, 6, 8}
    set_c = {5, 7, 9, 2}


# PROGRAM RUN
if __name__ == "__main__":
    main()
