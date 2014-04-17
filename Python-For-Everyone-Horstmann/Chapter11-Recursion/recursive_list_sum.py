# Recursively calculates the sum of a list's items


# FUNCTIONS
def _sum_helper(given_list, start):
    if start == len(given_list):
        return 0
    return given_list[start] + _sum_helper(given_list, start + 1)


def recursive_sum(given_list):
    return _sum_helper(given_list, 0)
