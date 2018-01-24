import javax.swing.*;

public abstract class Exam {
    protected Question[] questions =new Question[50];
    protected int currentNumberOfQuestions =0;
    protected int rightAnswer =0;
    protected int totalScore =0;
    public void addQuestion(Question p){
        questions[currentNumberOfQuestions++]=p;
    }
    public void increaseScore(int score){
        this.totalScore +=score;
    }
    public void examResult(){
        JOptionPane.showMessageDialog(null,"You've got "+this.totalScore+" points");
    }
    public abstract void doExam();
}
