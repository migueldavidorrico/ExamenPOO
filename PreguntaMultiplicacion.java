import javax.swing.*;

public class PreguntaMultiplicacion extends PreguntaAritmetica {
    public PreguntaMultiplicacion() {
        super(1,1,10,1,10,'*');
        this.setResultado(this.primerOperando*this.segundoOperando);
    }

    @Override
    public void mostrarPista() {
        String salida="RECUERDA LA TABLA DE MULTIPLICAR\n";
        for (int i = 1; i < 10; i++) {
            salida+=i+"x"+this.segundoOperando+"="+i*this.segundoOperando+"\n";
        }

        JOptionPane.showMessageDialog(null,salida);
    }
}
