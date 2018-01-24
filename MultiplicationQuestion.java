import javax.swing.*;

public class MultiplicationQuestion extends ArithmeticQuestion {
    private static final int MULTIPLICATION_MINIMUM = 1;
    private static final int MULTIPLICATION_INTERVAL = 10;
    private static final int MULTIPLICATION_SCORE = 3;


    public MultiplicationQuestion() {
        super(MULTIPLICATION_SCORE);
        this.first = (int) (Math.random() * MULTIPLICATION_INTERVAL) + MULTIPLICATION_MINIMUM;
        this.second = (int) (Math.random() * MULTIPLICATION_INTERVAL) + MULTIPLICATION_MINIMUM;
        this.result = first * second;
    }

    @Override
    public char getOperator() {
        return '*';
    }

    @Override
    public void showClue() {
        String output = "RECALL THE MULTIPLICATION TABLE\n";
        for (int i = 1; i < 10; i++) {
            output += i + "x" + getFirstOperand() + "=" + i * getSecondOperand() + "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
