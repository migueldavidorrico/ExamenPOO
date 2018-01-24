import javax.swing.*;

public class PreguntaSuma extends PreguntaAritmetica{

    public PreguntaSuma() {
        super(1,200,100,200,100,'+');
        this.setResultado(this.primerOperando+this.segundoOperando);
    }



    @Override
    public void mostrarPista() {
        JOptionPane.showMessageDialog(null,"Suma unidades, decenas y centenas");
    }
}
