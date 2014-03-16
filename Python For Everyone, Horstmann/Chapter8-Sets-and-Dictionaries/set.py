# DOCUMENTATION


# main
def main():
    canadian = {"red", "white"}
    british = {"red", "blue", "white"}
    italian = {"red", "white", "green"}

    if canadian.issubset(british):
        print("canadian flag colours occur in british")
    if not italian.issubset(british):
        print("not all italian flag colors occur in british")

    french = {"red", "white", "blue"}

    if french == british:
        print("all colors in french occur in british")

    french.add("transparent")
    print(french)
    french.discard("transparent")
    print(french)

    print(canadian.union(italian))
    print(british.intersection(italian))
    print(british.difference(italian))

    try:
        french.remove("waldo")
    except Exception:
        print("waldo not found")

    print(french.clear())


# PROGRAM RUN
if __name__ == "__main__":
    main()
