/*Implement a VotingMachine class that can be used for a simple election. Have meth­ods
to clear the machine state, to vote for a Democrat, to vote for a Republican, and to
get the tallies for both parties.*/

public class P8_10 {
    private int democratsVotes;
    private int republicanVotes;

    public void clear() {
        this.democratsVotes = 0;
        this.republicanVotes = 0;
    }

    public void voteDemocrats() {
        this.democratsVotes += 1;
    }

    public void voteRepublicans() {
        this.republicanVotes += 1;
    }

    public void showVotes() {
        System.out.println("Democrats:" + this.democratsVotes);
        System.out.println("Republicans: " + this.republicanVotes);
    }
}
