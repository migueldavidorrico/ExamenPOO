public class RealExamen extends Exam {
    //Only asks each question once
    @Override
    public void doExam() {
        for (int i = 0; i < this.currentNumberOfQuestions; i++) {
            Question p = this.questions[i];
            p.ask();
            if (p.isAnswerRight) {
                this.increaseScore(p.score);
            }
        }
        examResult();
    }
}
