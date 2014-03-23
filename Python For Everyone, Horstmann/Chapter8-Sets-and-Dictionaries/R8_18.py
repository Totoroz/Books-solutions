# Given a dictionary
# gradeCounts = { "A": 8, "D": 3, "B": 15, "F": 2, "C": 6 }
# write the Python statement(s) to print:
# a.   all the keys.
# b.   all the values.
# c.   all the key and value pairs.
# d.   all of the key and value pairs in key order.
# e.   the average value.
# f.   a chart similar to the following in which each row contains a key followed by a
# number of asterisks equal to the key’s data value. The rows should be printed in
# key order, as shown below.
# A: ********
# B: ***************
# C: ******
# D: ***
# F: **


# FUNCTIONS
def print_keys(dictionary):
    keys = []
    for key in sorted(dictionary.keys()):
        keys.append(key)
    return "\n".join(keys)


def print_values(dictionary):
    values = []
    for value in dictionary.values():
        values.append(value)
    values = list(map(str, sorted(values)))
    return "\n".join(values)


def print_pairs(dictionary):
    pairs = []
    for key in sorted(dictionary):
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


def print_bar_charts(dictionary):
    output_bars = []
    for key in sorted(dictionary):
        bar_chart = "*" * dictionary[key]
        output_bars.append("{}: {}".format(key, bar_chart))
    return "\n".join(output_bars)


# main
def main():
    grade_counts = {"A": 8, "D": 3, "B": 15, "F": 2, "C": 6}
    print(print_keys(dictionary))


# PROGRAM RUN
if __name__ == "__main__":
    main()
