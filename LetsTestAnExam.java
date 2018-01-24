public class LetsTestAnExam {
    public static void main(String[] args) {
        mockExam e = new mockExam();
        e.addQuestion(new AdditionQuestion());
        e.addQuestion(new SubtractionQuestion());
        e.addQuestion(new MultiplicationQuestion());
        e.addQuestion(new AdditionQuestion());


        String[] options = {
                "Blanco",
                "Negro",
                "Gris",
                "Pardo"
        };
        MultipleOptionQuestion t = new MultipleOptionQuestion(2, "¿De qué color es un oso polar?", options, 0, "Vive en el polo Norte");
        e.addQuestion(t);
        e.doExam();
    }


}
