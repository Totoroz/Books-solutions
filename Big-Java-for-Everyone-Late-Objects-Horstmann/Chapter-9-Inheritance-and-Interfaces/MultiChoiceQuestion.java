import java.util.ArrayList;
import java.util.Scanner;

/*Add a class MultiChoiceQuestion to the question hierarchy of Section 9.1 that allows
 multiple correct choices. The respondent should provide all correct choices, sepa­
 rated by spaces. Provide instructions in the question text.*/

public class MultiChoiceQuestion extends ChoiceQuestion {
    private ArrayList<String> allAnswers;

    public MultiChoiceQuestion() {
        super();
        this.allAnswers = new ArrayList<String>();
    }

    public void setAnswer(String correctResponse) {
        this.allAnswers.add(correctResponse);
    }

    public boolean checkAnswer(String response) {
        Scanner parser = new Scanner(response);
        ArrayList<String> correctAnswersSeen = new ArrayList<String>();
        int totalAnswers = 0;
        while (parser.hasNext()) {
            String answer = parser.next();
            if (this.allAnswers.contains(answer) && !correctAnswersSeen.contains(answer)) {
                correctAnswersSeen.add(answer);
            }
            totalAnswers += 1;
        parser.close();
        }
        return correctAnswersSeen.size() == this.allAnswers.size() && totalAnswers == allAnswers.size();
    }
    
    public void display() {
        super.display();
        System.out.println("Note: there are several correct answers. List all of them separated by spaces");
    }
}
