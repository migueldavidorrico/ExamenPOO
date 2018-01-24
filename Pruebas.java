public class Pruebas {
    public static void main(String[] args) {
        ExamenRepaso e=new ExamenRepaso();
        e.addPregunta(new PreguntaSuma());
        e.addPregunta(new PreguntaResta());
        e.addPregunta(new PreguntaMultiplicacion());
        e.addPregunta(new PreguntaSuma());


        String[] opciones={
                "Blanco",
                "Negro",
                "Gris",
                "Pardo"
        };
        PreguntaTest t=new PreguntaTest(2,"¿De qué color es un oso polar?",opciones,0,"Vive en el polo Norte");
        e.addPregunta(t);
        e.hacerExamen();
    }


}
