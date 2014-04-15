# Write for loops that iterate over the elements of a list without the use of the range
# function for the following tasks.
#     b.	 Computing the product of all elements in a list.

list = [ 1, 2, 3, 4, 5 ]

productItems = 1

for item in list:
    productItems *= item


print("Product of all items:", productItems)