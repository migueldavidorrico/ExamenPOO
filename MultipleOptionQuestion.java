import javax.swing.*;

public class MultipleOptionQuestion extends Question {
    String statement;
    String[] options;
    String clue;
    int rightOption;

    public MultipleOptionQuestion(int score, String statement, String[] options, int rightOption, String clue) {
        super(1);
        this.statement = statement;
        this.options = options;
        this.clue = clue;
        this.rightOption =rightOption;
    }

    @Override
    public void ask() {
        String answer=(String)JOptionPane.showInputDialog(null, statement,"Question Test",JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
        if(answer.equals(options[rightOption])){
            this.isAnswerRight =true;
        }

    }


    @Override
    public void showClue() {
        JOptionPane.showMessageDialog(null,clue);

    }
}
