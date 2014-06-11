public class ChoiceQuestion extends Question {
    private int nChoices;

    public ChoiceQuestion() {
        super();
    }

    public void addChoice(String choice, boolean correct) {
        nChoices += 1;
        super.addText(String.format("\n%d)%s", nChoices, choice));
        if (correct) {
            // Convert choices.size() to string
            String choiceString = "" + nChoices;
            setAnswer(choiceString);
        }
    }

    public String toString() {
        return getClass().getName();
    }
}
