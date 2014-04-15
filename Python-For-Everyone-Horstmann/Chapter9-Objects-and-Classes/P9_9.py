# Implement a class ComboLock that works like the combination lock
# in a gym locker, as shown here. The lock is constructed with a
# combina­tion—three numbers between 0 and 39. The reset method
# resets the dial so that it points to 0. The turnLeft and turnRight
# methods turn the dial by a given number of ticks to the left or
# right. The open method attempts to open the lock. The lock opens
# if the user first turned it right to the first number in the combina-
# tion, then left to the second, and then right to the third.
#     class ComboLock :
#         def ComboLock(self, secret1, secret2, secret3):
#             def reset(self) :
#             . . .
#             def turnLeft(self, ticks) :
#             . . .
#             def turnRight(self, ticks) :
#             . . .
#             def open(self) :


class ComboLock():
    def __init__(self, secret1, secret2, secret3):
        self._secrets = [self.assign_secret(secret1), self.assign_secret(secret2), self.assign_secret(secret3)]
        self._dial = 0

    def assign_secret(self, secret):
        if secret > 39:
            return 39
        elif secret < 0:
            return 0
        return secret

    def reset(self):
        self._dial = 0

    def turn_right(self, ticks):
        self._dial = self.dial_scrolling(ticks)
        self.should_unlock(self.get_secret(1))
        if self.get_secret(1) is True:
            print("Secret 1 unlocked.")
            if self.get_secret(2) is True:
                self.should_unlock(self.get_secret(3))
                if self.get_secret(3) is True:
                    print("Combo lock unlocked.")

    def get_secret(self, id):
        return self._secrets[id-1]

    def turn_left(self, ticks):
        self._dial = self.dial_scrolling(-ticks)
        if self.get_secret(1) is True:
            self.should_unlock(self.get_secret(2))
            if self.get_secret(2) is True:
                print("Secret 2 unlocked")

    def should_unlock(self, secret):
        if self.get_dial() == secret:
            secret = True
            return True
        return False

    def get_dial(self):
        return self._dial

    def dial_scrolling(self, ticks):
        dial_pos = 0
        dial = self.get_dial()
        if dial + ticks > 39:
            if ticks >= 39:
                dial_pos += ticks - 39
            elif dial >= 39:
                dial_pos += dial - 40 + ticks
        elif dial + ticks < 0:
            dial_pos = 40 + ticks
        else:
            dial_pos += ticks
        return dial_pos
