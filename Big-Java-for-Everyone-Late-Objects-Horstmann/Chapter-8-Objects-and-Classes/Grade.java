public class Grade {
    private String grade;
    private double score;

    public Grade(String grade) {
        this.grade = grade;
    }

    public void assignGrade() {
        char gradeLetter = this.grade.charAt(0);
        char gradeSign = (this.grade.length() == 2) ? this.grade.charAt(1) : ' ';
        if (gradeLetter == 'A') {
            score = 4;
        } else if (gradeLetter == 'B') {
            score = 3;
        } else if (gradeLetter == 'C') {
            score = 2;
        } else if (gradeLetter == 'D') {
            score = 1;
        } else if (gradeLetter == 'F') {
            score = 0;
        }

        if (gradeSign == '+') {
            score += 0.3;
        } else if (gradeSign == '-') {
            score -= 0.3;
        }
    }

    public double getScore() {
        return this.score;
    }
}
