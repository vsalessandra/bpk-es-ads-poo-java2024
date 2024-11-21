package exercicio08;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Paulo Andrade", "Matematica", 5500);

        System.out.println(professor.toString());
        professor.darAula();
        professor.corrigirProva();
        System.out.println(professor.toString());
    }
}
