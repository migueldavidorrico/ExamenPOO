public class mockExam extends Exam {
    //The student only scores if they are right in their first attempt
    //If they are wrong, a clue is shown

    @Override
    public void doExam() {
        for (int i = 0; i < this.currentNumberOfQuestions; i++) {
            Question p = this.questions[i];
            p.ask();
            if (p.isAnswerRight) {
                this.increaseScore(p.score);
            }
            while (!p.isAnswerRight) {
                p.showClue();
                p.ask();
            }
        }
        examResult();
    }
}
