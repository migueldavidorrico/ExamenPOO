import javax.swing.*;

public abstract class ArithmeticQuestion extends Question {
    protected int firstOperand;
    protected int secondOperand;
    protected int result;
    protected char operator;

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    //additions may have a wider interval in order to make them harder than multiplications, for example
    public ArithmeticQuestion(int score, int minFirst, int intervalFirst, int minSecond, int intervalSecond, char operator) {
        super(score);
        this.firstOperand = (int) (Math.random()*intervalFirst)+minFirst;
        this.secondOperand =(int) (Math.random()*intervalSecond)+minSecond;
        this.operator = operator;
    }

    public String stringQuestion(){
        return "How much is it? "+ firstOperand + operator + secondOperand;
    }

    @Override
    public void ask(){
        String answer=null;
        while(answer==null || answer.equals("")){
            answer=JOptionPane.showInputDialog(null,this.stringQuestion());
            if(answer!=null){
                if(Integer.parseInt(answer)== result){
                    isAnswerRight =true;
                }
            }
        }
        System.out.println(isAnswerRight ? "Right" : "Wrong"); //For debugging
    }

}
