# The nested loops
#     for i in range(height) :
#         for j in range(width) :
#             print("*", end="")
#         print()
# display a rectangle of a given width and height, such as
#     ****
#     ****
#     ****
# Write a single  for loop that displays the same rectangle.

width = int(input("Width:"))
height = int(input("Height:"))

for i in range(height * width):
    print("*", end = "")

    if i % width == width - 1:
        print()