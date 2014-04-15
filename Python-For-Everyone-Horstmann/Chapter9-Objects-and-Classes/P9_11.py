# Provide a class for authoring a simple letter. In the constructor, supply the names of
# the sender and the recipient:

#     def _ _init_ _(self, letterFrom, letterTo)
# Supply a method
#     def addLine(self, line)
# to add a line of text to the body of the letter. Supply a method
#     def getText(self)
# that returns the entire text of the letter. The text has the form:

#     Dear recipient name :
#     blank line
#     first line of the body
#     second line of the body
#     . . .
#     last line of the body
#     blank line
#     Sincerely,
#     blank line
#     sender name

# Also supply a driver program that prints the following letter.
#     Dear John:

#     I am sorry we must part.
#     I wish you all the best.

#     Sincerely,

#     Mary

# Construct an object of the Letter class and call addLine twice.


class Letter():
    def __init__(self, letter_from, letter_to):
        self._from = letter_from
        self._to = letter_to
        self._text = ""

    def add_line(self, line):
        self._text += "{}\n".format(line)

    def get_text(self):
        output = "Dear {}:\n\n".format(self._from)
        output += self._text
        output += "Sincerely,\n\n{}".format(self._to)
        return output
