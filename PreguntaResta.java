import javax.swing.*;

public class PreguntaResta extends PreguntaAritmetica{

    public PreguntaResta() {
        super(1,10,20,0,10,'-');
        this.setResultado(this.primerOperando-this.segundoOperando);
    }

    @Override
    public void mostrarPista() {
        JOptionPane.showMessageDialog(null,"Pueden salir negativos");
    }
}
