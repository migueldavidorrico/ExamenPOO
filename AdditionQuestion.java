import javax.swing.*;

public class AdditionQuestion extends ArithmeticQuestion {

    private static final int ADDITION_MINIMUM = 100;
    private static final int ADDITION_INTERVAL = 200;
    private static final int ADDITION_SCORE = 1;

    public AdditionQuestion() {
        super(ADDITION_SCORE);
        this.first = (int) (Math.random() * ADDITION_INTERVAL) + ADDITION_MINIMUM;
        this.second = (int) (Math.random() * ADDITION_INTERVAL) + ADDITION_MINIMUM;
        this.result = first + second;
    }

    @Override
    public char getOperator() {
        return '+';
    }

    @Override
    public void showClue() {
        JOptionPane.showMessageDialog(null, "Be careful when you add more than 10 units");
    }
}
