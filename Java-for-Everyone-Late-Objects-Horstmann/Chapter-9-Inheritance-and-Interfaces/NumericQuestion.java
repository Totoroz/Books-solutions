/*P9.1     Add a class NumericQuestion to the question hierarchy of Section 9.1. If the response
and the expected answer differ by no more than 0.01, then accept the response as
correct.*/

public class NumericQuestion extends Question {
    private double answer;

    public void setAnswer(double correctResponse) {
        answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        double responseDouble = Double.parseDouble(response);
        return Math.abs(responseDouble - answer) <= 0.01;
    }
}
