# Recursively calculates the sum of a list's items by splitting the list in two.


# FUNCTIONS
def _sum_helper(given_list, start):
    if start == len(given_list):
        return 0
    return given_list[start] + _sum_helper(given_list, start + 1)


def split_recursive_sum(given_list):
    middle = len(given_list) // 2
    return _sum_helper(given_list[:middle], 0) + _sum_helper(given_list[middle:], 0)
