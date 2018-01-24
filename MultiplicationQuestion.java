import javax.swing.*;

public class MultiplicationQuestion extends ArithmeticQuestion {
    public MultiplicationQuestion() {
        super(1,1,10,1,10,'*');
        this.setResult(this.firstOperand *this.secondOperand);
    }

    @Override
    public void showClue() {
        String output="RECALL THE MULTIPLICATION TABLE\n";
        for (int i = 1; i < 10; i++) {
            output+=i+"x"+this.secondOperand +"="+i*this.secondOperand +"\n";
        }

        JOptionPane.showMessageDialog(null,output);
    }
}
