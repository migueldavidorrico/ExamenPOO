public abstract class Question {
    protected int score;
    protected boolean isAnswerRight;

    public Question(int puntuacion) {
        this.score = puntuacion;
    }

    public abstract void ask();
    public boolean respuestaCorrecta(){
        return this.isAnswerRight;
    }
    public abstract void showClue();

}
