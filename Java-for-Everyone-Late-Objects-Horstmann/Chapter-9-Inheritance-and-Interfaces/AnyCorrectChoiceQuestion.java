/* P9.4    Add a class AnyCorrectChoiceQuestion to the question hierarchy of Section 9.1 that
allows multiple correct choices. The respondent should provide any one of the correct choices.
The answer string should contain all of the correct choices, separated by spaces. 
Provide instructions in the question text.*/

public class AnyCorrectChoiceQuestion extends ChoiceQuestion {
    private String allAnswers;

    public AnyCorrectChoiceQuestion() {
        super();
    }

    public void setAnswer(String correctResponse) {
        allAnswers = correctResponse + " " + allAnswers;
    }

    public boolean checkAnswer(String response) {
        return allAnswers.contains(response);
    }
    
    public void display() {
        super.display();
    }
}
