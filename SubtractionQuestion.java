import javax.swing.*;

public class SubtractionQuestion extends ArithmeticQuestion {
    private static final int SUBTRACTION_MINIMUM = 0;
    private static final int SUBTRACTION_INTERVAL = 100;
    private static final int SUBTRACTION_SCORE = 1;

    public SubtractionQuestion() {
        super(SUBTRACTION_SCORE);
        this.first = (int) (Math.random() * SUBTRACTION_INTERVAL) + SUBTRACTION_MINIMUM;
        this.second = (int) (Math.random() * SUBTRACTION_INTERVAL) + SUBTRACTION_MINIMUM;
        this.result = first - second;
    }

    @Override
    public char getOperator() {
        return '-';
    }

    @Override
    public void showClue() {
        JOptionPane.showMessageDialog(null, "The answer may be a negative number");
    }

}
