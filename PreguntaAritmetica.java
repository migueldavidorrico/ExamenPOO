import javax.swing.*;

public abstract class PreguntaAritmetica extends Pregunta{
    protected int primerOperando;
    protected int segundoOperando;
    protected int resultado;
    protected char operador;

    public int getPrimerOperando() {
        return primerOperando;
    }

    public void setPrimerOperando(int primerOperando) {
        this.primerOperando = primerOperando;
    }

    public int getSegundoOperando() {
        return segundoOperando;
    }

    public void setSegundoOperando(int segundoOperando) {
        this.segundoOperando = segundoOperando;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public PreguntaAritmetica(int puntuacion,int minimoPrimero,int intervaloPrimero,int minimoSegundo,int intervaloSegundo,char operador) {
        super(puntuacion);
        this.primerOperando = (int) (Math.random()*intervaloPrimero)+minimoPrimero;
        this.segundoOperando=(int) (Math.random()*intervaloSegundo)+minimoSegundo;
        this.operador = operador;
    }

    public String cadenaEnunciado(){
        return "¿Cuánto es "+primerOperando+operador+segundoOperando+"?";
    }

    @Override
    public void preguntar(){
        String respuesta=null;
        while(respuesta==null || respuesta.equals("")){
            respuesta=JOptionPane.showInputDialog(null,this.cadenaEnunciado());
            if(respuesta!=null){
                if(Integer.parseInt(respuesta)==resultado){
                    contestadaCorrectamente=true;
                }
            }
        }
        System.out.println(contestadaCorrectamente ? "Correcto" : "Incorrecto");
    }

}
