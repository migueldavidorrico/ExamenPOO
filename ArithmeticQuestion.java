import javax.swing.*;

public abstract class ArithmeticQuestion extends Question {


    //additions may have a wider interval in order to make them harder
    // than multiplications, for example, and we want divisions to be exact so
    //child classes provide operands
    protected int first;
    protected int second;
    protected int result;


    public int getFirstOperand() {
        return first;
    }

    public int getSecondOperand() {
        return second;
    }

    public int getResult() {
        return result;
    }

    public abstract char getOperator();


    public ArithmeticQuestion(int score) {
        super(score);
    }

    public String stringQuestion() {
        return "How much is it? " +
                getFirstOperand() +
                getOperator() +
                getSecondOperand();
    }

    @Override
    public void ask() {
        String answer = null;
        while (answer == null || answer.equals("")) {
            answer = JOptionPane.showInputDialog(null, this.stringQuestion());
            if (answer != null) {
                if (Integer.parseInt(answer) == getResult()) {
                    isAnswerRight = true;
                }
            }
        }
        System.out.println(isAnswerRight ? "Right" : "Wrong"); //For debugging
    }

}
