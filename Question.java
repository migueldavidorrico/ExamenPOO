public abstract class Question {
    protected int score;
    protected boolean isAnswerRight;

    public Question(int puntuacion) {
        this.score = puntuacion;
    }

    public int getScore() {
        return score;
    }

    public abstract void ask();

    public abstract void showClue();

}
