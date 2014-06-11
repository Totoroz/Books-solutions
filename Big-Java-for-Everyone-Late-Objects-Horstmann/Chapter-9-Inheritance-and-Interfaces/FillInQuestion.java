import java.util.Scanner;

/* P9.2    Add a class FillInQuestion to the question hierarchy of Section 9.1. Such a question is
 constructed with a string that contains the answer, surrounded by _ _ , for exam­ple,
 "The inventor of Java was _James Gosling_" . The question should be displayed as
 The inventor of Java was _____*/

public class FillInQuestion extends Question {
    public void setText(String questionText) {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        parser.close();

        super.setText(question);
        super.setAnswer(answer);
    }
}
