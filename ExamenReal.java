public class ExamenReal extends Examen{
    @Override
    public void hacerExamen() {
        for (int i = 0; i < this.numeroPreguntas; i++) {
            Pregunta p=this.preguntas[i];
            p.preguntar();
            if(p.contestadaCorrectamente){
                this.sumaPuntuacion(p.puntuacion);
            }
        }
    }
}
