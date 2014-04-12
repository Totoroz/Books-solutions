# Implement a VotingMachine class that can be used for a simple election. Have meth­ods
# to clear the machine state, to vote for a Democrat, to vote for a Republican, and to
# get the tallies for both parties.


class VotingMachine():
    def __init__(self):
        self._votes_democrats = 0
        self._votes_republicans = 0

    def get_votes_democrats(self):
        return self._votes_democrats

    def get_votes_republicans(self):
        return self._votes_republicans

    def vote_democrats(self):
        self._votes_democrats += 1

    def vote_republicans(self):
        self._votes_republicans += 1

    def show_tallies(self):
        output = []
        output = "Democrats: {}".format("*" * self.get_votes_democrats())
        output = "Republicans: {}".format("*" * self.get_votes_republicans())
        return "\n".join(output)
