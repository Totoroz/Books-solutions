# DOCUMENTATION


# FUNCTIONS
def print_keys(dictionary):
    keys = []
    for key in dictionary.keys():
        keys.append(key)
    keys.sort()
    return "\n".join(keys)


def print_value(dictionary):
    values = []
    for value in dictionary.values():
        values.append(value)
    values = list(map(str, values))
    values.sort()
    return "\n".join(values)


def print_pairs(dictionary):
    pairs = []
    for key in dictionary:
        pairs.append((key, dictionary[key]))
    pairs.sort()
    return "\n".join(map(str, pairs))


def print_average_value(dictionary):
    total = 0
    sum = 0
    for value in dictionary.values():
        total += 1
        sum += value
    return sum / total


# main
def main():
    grade_counts = {"A": 8, "D": 3, "B": 15, "F": 2, "C": 6}
    print(print_keys(dictionary))


# PROGRAM RUN
if __name__ == "__main__":
    main()
