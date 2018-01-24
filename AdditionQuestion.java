import javax.swing.*;

public class AdditionQuestion extends ArithmeticQuestion {

    public AdditionQuestion() {
        super(1,200,100,200,100,'+');
        this.setResult(this.firstOperand +this.secondOperand);
    }



    @Override
    public void showClue() {
        JOptionPane.showMessageDialog(null,"Be careful when you add more than 10 units");
    }
}
