/*Implement a class Student . For the purpose of this exercise, a student has a name
and a total quiz score. Supply an appropriate constructor and methods getName() ,
addQuiz(int score) , getTotalScore() , and getAverageScore() . To compute the latter, you
also need to store the number of quizzes that the student took.*/

public class P8_07 {
    private String name;
    private double totalScore;
    private int scoreCount;
    
    public P8_07(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addQuiz(double score) {
        this.totalScore += score;
        this.scoreCount += 1;
    }
    
    public double getTotalScore() {
        return this.totalScore;
    }
    
    public double getAverageScore() {
        return this.totalScore / this.scoreCount;
    }
}
