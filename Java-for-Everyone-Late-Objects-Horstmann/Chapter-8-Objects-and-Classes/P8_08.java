/*Modify the Student class of Exercise P8.7 to compute grade point averages. Meth­ods
are needed to add a grade and get the current GPA. Specify grades as elements of a
class Grade . Supply a constructor that constructs a grade from a string, such as "B+" .
You will also need a method that translates grades into their numeric values (for
example, "B+" becomes 3.3).*/

public class P8_08 {
    private String name;
    private double totalScore;
    private int scoreCount;
    
    public P8_08(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addQuiz(double score) {
        this.totalScore += score;
        this.scoreCount += 1;
    }
    
    public void addQuiz(Grade grade) {
        this.totalScore += grade.getScore();
        this.scoreCount += 1;
    }
    
    public double getTotalScore() {
        return this.totalScore;
    }
    
    public double getAverageScore() {
        return this.totalScore / this.scoreCount;
    }
}
