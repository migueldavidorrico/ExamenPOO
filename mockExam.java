public class mockExam extends Exam {

    @Override
    public void doExam() {
        for (int i = 0; i < this.currentNumberOfQuestions; i++) {
            Question p=this.questions[i];
            p.ask();
            if(p.isAnswerRight){
                this.increaseScore(p.score);
            }
            while(!p.isAnswerRight){
                p.showClue();
                p.ask();
            }
        }
    }
}
