import javax.swing.*;

public class PreguntaTest extends Pregunta {
    String enunciado;
    String[] opciones;
    String pista;
    int correcta;

    public PreguntaTest(int puntuacion, String enunciado, String[] opciones, int correcta, String pista) {
        super(1);
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.pista = pista;
        this.correcta=correcta;
    }

    @Override
    public void preguntar() {
        String respuesta=(String)JOptionPane.showInputDialog(null,enunciado,"Pregunta Test",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        if(respuesta.equals(opciones[correcta])){
            this.contestadaCorrectamente=true;
        }

    }


    @Override
    public void mostrarPista() {
        JOptionPane.showMessageDialog(null,pista);

    }
}
