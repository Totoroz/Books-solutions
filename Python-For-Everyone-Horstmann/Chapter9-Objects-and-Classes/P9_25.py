# Design a class Mailbox that stores e-mail messages, using the Message class of Exercise
# P9.24. Implement the following methods:
# •    def addMessage(self, message)
# •    def getMessage(self, index)
# •    def removeMessage(self, index)


class Mailbox():
    def __init__(self):
        self._mails = []

    def list_messages(self):
        output = []
        for i, message in enumerate(self._mails):
            output.append("[{}] From: {}, To: {}".format(i, message.get_sender(), message.get_recipient()))
        return "\n".join(output)

    def add_message(self, message_object):
        self._mails.append(message_object)

    def get_message(self, index):
        return self._mails[index].to_string()

    def remove_message(self, index):
        del self._mails[index]
