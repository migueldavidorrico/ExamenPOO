import javax.swing.*;

public abstract class Exam {
    protected Question[] questions = new Question[50];
    protected int currentNumberOfQuestions = 0;
    protected int totalScore = 0;

    public void addQuestion(Question p) {
        questions[currentNumberOfQuestions++] = p;
    }

    public void increaseScore(int score) {
        this.totalScore += score;
    }

    public int maximumPossibleScore() {
        int total = 0;
        for (int i = 0; i < currentNumberOfQuestions; i++) {
            total += questions[i].getScore();
        }
        return total;
    }

    public void examResult() {
        JOptionPane.showMessageDialog(null, "You've got " + this.totalScore + " points out of: " + maximumPossibleScore());
    }

    public abstract void doExam();
}
