# Design a class Message that models an e-mail message. A message has a recipient, a
# sender, and a message text. Support the following methods:
# •    A constructor that takes the sender and recipient
# •    A method append that appends a line of text to the message body
# •    A method toString that makes the message into one long string like this: "From:
# Harry Morgan\nTo: Rudolf Reindeer\n . . ."
# Write a program that uses this class to make a message and print it.


class Message():
    def __init__(self, sender, recipient):
        self._sender = sender
        self._recipient = recipient
        self._text = []

    def get_sender(self):
        return self._sender

    def get_recipient(self):
        return self._recipient

    def add_message(self, message):
        self._text.append(message)

    def to_string(self):
        output = "From: {}\nTo: {}\n".format(self._sender, self._recipient)
        output += "\n".join(self._text)
        return output
