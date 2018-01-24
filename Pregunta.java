public abstract class Pregunta {
    protected int puntuacion;
    protected boolean contestadaCorrectamente;

    public Pregunta(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public abstract void preguntar();
    public boolean respuestaCorrecta(){
        return this.contestadaCorrectamente;
    }
    public abstract void mostrarPista();

}
