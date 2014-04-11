# Reimplement the Menu class so that it stores all menu items in one long string.
# Hint: Keep a separate counter for the number of options. When a new option is
# added, append the option count, the option, and a newline character.


class Menu():
    def __init__(self):
        self._options = ""
        self._options_count = 0

    def add_option(self, option):
        self._options += "{}\n".format(option)
        self._options_count += 1

    def get_options(self):
        output = ""
        for i, option in enumerate(self._options.split("\n")[:-1]):
            output += "[{}] {}".format(i+1, option)
        return output

    def get_options_count(self):
        return self._options_count

    def get_input(self):
        exit = False
        while not exit:
            print(self.get_options())
            choice = int(input("option>"))
            if choice >= 1 and choice <= self.get_options_count():
                exit = True
        return choice
