import javax.swing.*;

public abstract class Examen {
    protected Pregunta[] preguntas=new Pregunta[50];
    protected int numeroPreguntas=0;
    protected int acertadas=0;
    protected int puntuacionTotal =0;
    public void addPregunta(Pregunta p){
        preguntas[numeroPreguntas++]=p;
    }
    public void sumaPuntuacion(int puntuacion){
        this.puntuacionTotal +=puntuacion;
    }
    public void resultadoExamen(){
        JOptionPane.showMessageDialog(null,"Has sacado un "+this.puntuacionTotal);
    }
    public abstract void hacerExamen();
}
