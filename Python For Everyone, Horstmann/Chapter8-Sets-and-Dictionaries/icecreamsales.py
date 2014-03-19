# DOCUMENTATION


# FUNCTIONS
def read_data(filename):
    sales_dictionary = {}
    opened_file = open(filename, "r")
    for line in opened_file:
        fields = line.split(":")
        flavor = fields[0]
        sales_dictionary[flavor] = build_list(fields)
    opened_file.close()
    return sales_dictionary


def build_list(fields):
    store_sales_list = []
    for i in range(1, len(fields)):
        sales = float(fields[i])
        store_sales_list.append(sales)
    return store_sales_list


def print_report(sales_data):
    num_stores = 0
    for store_sales in sales_data.values():
        if len(store_sales) > num_stores:
            num_stores = len(store_sales)

    store_totals = [0.0] * num_stores

    for flavor in sorted(sales_data):
        print("%-15s" % flavor, end="")

        flavor_total = 0.0
        store_sales = sales_data[flavor]
        for i in range(len(store_sales)):
            sales = store_sales[i]
            flavor_total += sales
            store_totals[i] += sales
            print("%10.2f" % sales, end="")

        print("%15.2f" % flavor_total)

    print("%15s" % " ", end="")
    for i in range(num_stores):
        print("%10.2f" % store_totals[i], end="")
    print()


def highest_sold_flavor(dictionary):
    max_flavor = ""
    max_sales = ""
    for list in dictionary:
        for value in dictionary[list]:
            if value > max_sales:
                max_flavor = dictionary[list]
                max_sales = value
    return max_sales


# main
def main():
    sales_data = read_data("icecream.txt")
    print_report(sales_data)


# PROGRAM RUN
if __name__ == "__main__":
    main()
