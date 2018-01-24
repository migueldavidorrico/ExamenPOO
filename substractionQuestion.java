import javax.swing.*;

public class substractionQuestion extends ArithmeticQuestion {

    public substractionQuestion() {
        super(1,10,20,0,10,'-');
        this.setResult(this.firstOperand -this.secondOperand);
    }

    @Override
    public void showClue() {
        JOptionPane.showMessageDialog(null,"The answer may be a negative number");
    }
}
